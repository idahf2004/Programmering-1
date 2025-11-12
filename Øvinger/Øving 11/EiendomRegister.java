import java.util.ArrayList;

public class EiendomRegister {
    private ArrayList<Eiendom> eiendommer;

    public EiendomRegister() {
        this.eiendommer = new ArrayList<>(); 
    }

    public void registrerEiendom(Eiendom eiendom) {
        eiendommer.add(eiendom);
    }

    public void slettEiendom(Eiendom eiendomSlett) {
        eiendommer.remove(eiendomSlett);
    }

    public int antallEiendommer() {
        return eiendommer.size();
    }

    public void skrivUtAlleEiendommer() {
        eiendommer.forEach(System.out::println);
    }

    public ArrayList<Eiendom> sokEtterEiendom(int kommunenr, int gnr, int bnr) {
        return new ArrayList<>(
            eiendommer.stream()
                .filter(e -> e.getKommuneNummer() == kommunenr)
                .filter(e -> e.getGnr() == gnr)
                .filter(e -> e.getBnr() == bnr)
                .toList()
        );
    }

    public double gjennomsnittsAreal() {
       double sumAreal = 0;
       int count = 0;

       for (Eiendom e : eiendommer) {
            sumAreal += e.getAreal();
            count ++;
        }
        double gjennomsnittsAreal = sumAreal / count;
        return gjennomsnittsAreal;
    }

    public ArrayList<Eiendom> gittGardsnummer(int gardsnummer) {
        return new ArrayList<>(
            eiendommer.stream()
                .filter(e -> e.getGnr() == gardsnummer)
                .toList()
        );
    }
}
