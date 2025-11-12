import java.util.ArrayList;

public class Meny {
    private String navn;
    private ArrayList<Rett> retter;

    public Meny(String navn) {
        this.navn = navn;
        this.retter = new ArrayList<>();
    }

    public boolean leggTilRett(Rett nyRett) {
        return retter.add(nyRett);
    }

    public ArrayList<Rett> getRetter() {
        return new ArrayList<>(retter);
    }

    public double totalPris() {
        double total = 0;
        for (Rett r: retter) {
            total += r.getPris();
        }
        return total;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meny: ").append(navn).append("\n");

        for (Rett r : retter) {
            sb.append("  - ").append(r.toString()).append("\n");
        }

        sb.append(String.format("Totalpris: %.2f kr%n", totalPris()));
        return sb.toString();
    }
}
