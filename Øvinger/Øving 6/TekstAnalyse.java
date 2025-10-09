class TekstAnalyse {
    private int[] antallTegn = new int[30];
    private String tekst;

    public TekstAnalyse (String tekst) {
        this.tekst = tekst;
        String lav = tekst.toLowerCase();


        for (int i = 0; i < lav.length(); i++) {
            char tegn = lav.charAt(i);

            if (tegn >= 'a' && tegn <= 'z') {
                antallTegn[tegn - 'a']++;
            }
            else if (tegn == 'æ') {
                antallTegn[26]++;
            }
            else if (tegn == 'ø') {
                antallTegn[27]++;
            }
            else if (tegn == 'å') {
                antallTegn[28]++;
            }
            else {
                antallTegn[29]++;
            }
        }
    }

    public String getTekst() {
        return tekst;
    }

    public int[] getAntallTegn() {
        return antallTegn;
    }

    public int AntallUlikeBokstaver() {
        int teller = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > 0) {
                teller++;
            }
        }
        return teller;
    }

    public int TotaltAntallBokstaver() {
        int sum = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > 0) {
                sum += antallTegn[i];
            }
        }
        return sum;
    }

    public double AndelIkkeBokstaver () {
        int totalt = 0;
        for (int i = 0; i < antallTegn.length; i++) {
            totalt+= antallTegn[i];
        }
        double prosent = (double) antallTegn[29] / totalt * 100;
        return prosent;
    }

    public int SpesifikkBokstav (char bokstav) {
        bokstav = Character.toLowerCase(bokstav);

        if (bokstav >= 'a' && bokstav <= 'z') {
            return antallTegn[bokstav - 'a'];
        } else if (bokstav == 'æ') {
            return antallTegn[26]; 
        } else if (bokstav == 'ø') {
            return antallTegn[27]; 
        } else if (bokstav == 'å') {
            return antallTegn[28]; 
        }
        return 0;
    }

    public String BokstavOftest () {
        int antallOftest = 0;
        for (int i = 0; i < 29; i++) {
            if(antallTegn[i] > antallOftest) {
                antallOftest = antallTegn[i];
            }
        }
        String resultat = "";
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] == antallOftest) {
                char bokstav;
                if (i < 26) {
                    bokstav = (char) ('a' + i);
                } else if (i == 26) {
                    bokstav = 'æ';
                } else if (i == 27) {
                    bokstav = 'ø';
                } else {
                    bokstav = 'å';
                }
                resultat += bokstav + " ";
            }
        }

        return resultat.trim();
    }
}
