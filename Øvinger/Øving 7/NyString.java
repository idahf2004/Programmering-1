class NyString {
    private String ord;

    public NyString(String ord) {
        this.ord = ord;
    }

    public String getOrd() {
        return ord;
    }

    public String forkorting () {
        String[] tekst = ord.split(" ");
        String resultat = "";
        for (int i = 0; i < tekst.length; i++) {
            resultat += tekst[i].charAt(0);
        }
        return resultat;
    }

    public String fjerning(char bokstav) {
        String resultat = ord;
        int forekomst = resultat.indexOf(bokstav);

        while (forekomst != -1) {
            resultat = resultat.substring(0,forekomst) + resultat.substring(forekomst + 1);
            forekomst = resultat.indexOf(bokstav);
        }
        return resultat;
    }
}
