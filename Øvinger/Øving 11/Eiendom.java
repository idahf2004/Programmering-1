public class Eiendom {
    private int kommuneNummer;
    private String kommuneNavn;
    private int gnr;
    private int bnr;
    private String bruksnavn;
    private double areal;
    private String eier;

    public Eiendom(int kommuneNummer, String kommuneNavn, int gnr, int bnr, String bruksnavn, double areal, String eier) {
        this.kommuneNummer = kommuneNummer;
        this.kommuneNavn = kommuneNavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eier = eier;
    }

    public Eiendom(int kommuneNummer, String kommuneNavn, int gnr, int bnr, double areal, String eier) {
        this.kommuneNummer = kommuneNummer;
        this.kommuneNavn = kommuneNavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.areal = areal;
        this.eier = eier;
    }

    public int getKommuneNummer() {
        return kommuneNummer;
    }

    public String getKommuneNavn() {
        return kommuneNavn;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public String getBruksnavn() {
        return bruksnavn;
    }

    public double getAreal() {
        return areal;
    }

    public String getEier() {
        return eier;
    }

    @Override
    public String toString() {
        return String.format(
            "%d - %d/%d",
            kommuneNummer, gnr, bnr
        );
    }
}
