public class Rett {
    final private String navn;
    final private String typeRett;
    private double pris;
    private final String oppskrift;

    public Rett(String navn, String typeRett, double pris, String oppskrift) {
        this.navn = navn;
        this.typeRett = typeRett;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getTypeRett() {
        return typeRett;
    }

    public double getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    public double setPris(double nyPris) {
        return pris = nyPris;
    }

    
    @Override
    public String toString() {
        return String.format(
            "%s (%s) — %.2f kr%nOppskrift: %s",
            navn, typeRett, pris, oppskrift
        );
    }
}
