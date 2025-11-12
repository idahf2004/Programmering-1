public class Arrangement {
    private int nummer;
    private String navn;
    private String sted;
    private String arrangor;
    private long tidspunkt;
    private String type;

    public Arrangement(int nummer, String navn, String sted, String arrangor, long tidspunkt, String type) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangor = arrangor;
        this.tidspunkt = tidspunkt;
        this.type = type;
    }

    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }

    public String getSted() {
        return sted;
    }

    public String getArrangor() {
        return arrangor;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format(
            "Nr %d: %s (%s), arrangert av %s — tidspunkt: %d — type: %s", //Nr %d = sett inn heltall, %s = sett inn tekst
            nummer, navn, sted, arrangor, tidspunkt, type
        );
    }
}

