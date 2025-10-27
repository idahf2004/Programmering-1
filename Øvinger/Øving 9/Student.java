public class Student {
    private final String navn;
    private int antOppg;

    public Student (String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }
    
    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void oekAntOppg(int oekning) {
        antOppg += oekning;
    }

    public String toString() {
        return navn + " har " + antOppg + " oppgaver godkjent!";
    }
}
