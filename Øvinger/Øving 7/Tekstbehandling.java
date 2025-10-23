class Tekstbehandling {
    private String tekst;

    public Tekstbehandling(String tekst) {
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public int antallOrd() {
        String[] teksten = tekst.trim().split("\\s+");
        return teksten.length;
    }

    public double gjennomsnittligOrdlengde() {
        String[] teksten = tekst.trim().split("\\s+");
        int antallOrd = teksten.length;
        int antallBokstaver = 0;

        for (int i = 0; i < antallOrd; i++) {
            antallBokstaver += teksten[i].length();
        }
        return (double) antallBokstaver / antallOrd;
    }

    public double gjennomsnittligAntallOrdPerPeriode() {
        String[] setninger = tekst.split("[.!?]+");
        int totaltOrd = 0;
        int antallPerioder = 0;

        for (String setning : setninger) {
            setning = setning.trim();
            if (!setning.isEmpty()) {
                String[] ord = setning.split("\\s+");
                totaltOrd += ord.length;
                antallPerioder++;
            }
        }
        return (double) totaltOrd / antallPerioder;
    }

    public String skifteOrd(String ordSomSkalByttes, String bytteOrd) {
        return tekst.replaceAll("(?i)\\b" + ordSomSkalByttes + "\\b", bytteOrd); //"(?i)\\b" gjør case-insensetivt og må være start/slutt av ord
    }

    public String tekstIStoreBokstaver() {
        return tekst.toUpperCase();
    }
}
