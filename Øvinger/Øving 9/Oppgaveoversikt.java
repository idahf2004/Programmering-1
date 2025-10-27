public class Oppgaveoversikt {
    private Student[] studenter = new Student[100];
    private int antStud = 0;

    public Oppgaveoversikt(int antall) {
        studenter = new Student[antall];
    }

    public int getAntStud() {
        return antStud;
    }

    public int getAntOppg(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equalsIgnoreCase(navn)) {
                return studenter[i].getAntOppg();
            }
        }
        return -1;
    }

    public boolean registrerNyStudent(String navn, int antOppg) {
        if (antStud < studenter.length) {
            studenter[antStud] = new Student(navn, antOppg);
            antStud++;
            return true;
        }
        else {
            return false; //Tabellen er full!
        }
    }

    public boolean oekAntOppg(String navn, int oekning) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equalsIgnoreCase(navn)) {
                studenter[i].oekAntOppg(oekning);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String resultat = "Antall studenter er " + antStud + "\n";
        for (int i = 0; i < antStud; i++) {
            resultat += studenter[i].toString() + "\n"; 
        }
        return resultat;
    }
}
