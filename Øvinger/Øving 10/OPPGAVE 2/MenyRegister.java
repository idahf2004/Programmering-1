import java.util.ArrayList;

public class MenyRegister {
    private ArrayList<Rett> retter;
    private ArrayList<Meny> menyer;

    public MenyRegister() {
        this.retter = new ArrayList<>();
        this.menyer = new ArrayList<>();
    }

    public void leggTilNyRett(Rett nyRett) {
        retter.add(nyRett);
    }

    public ArrayList<Meny> finnMenyerMedRett(String rettNavn) {
        ArrayList<Meny> resultater = new ArrayList<>();

        for (Meny m : menyer) {
            for (Rett r : m.getRetter()) {
                if (r.getNavn().equalsIgnoreCase(rettNavn)) {
                    resultater.add(m);
                    break; 
                }
            }
        }
        return resultater;
    }

    public ArrayList<Rett> finnTypeRett(String typeRett) {
        ArrayList<Rett> funnetType = new ArrayList<>();
        
        for (Rett r : retter) {
            if(r.getTypeRett().equalsIgnoreCase(typeRett)) {
                funnetType.add(r);
            }
        }
        return funnetType;
    }

    public void leggTilNyMeny(Meny nyMeny) {
        menyer.add(nyMeny);
    }


    public ArrayList<Meny> totalPrisInnenforIntervall(double prisFra, double prisTil) {
        ArrayList<Meny> intervall = new ArrayList<>();

        for (Meny menyer : menyer) {
            if (menyer.totalPris() >= prisFra && menyer.totalPris() <= prisTil) {
                intervall.add(menyer);
            }
        }
        return intervall;
    }
}
