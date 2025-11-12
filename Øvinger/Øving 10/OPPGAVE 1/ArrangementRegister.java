
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer;

    public ArrangementRegister() {
        this.arrangementer = new ArrayList<>();
    }

    public boolean registrerArrangement(Arrangement nyttArrangement) {
        return arrangementer.add(nyttArrangement);
    }

    public ArrayList<Arrangement> finnArrPaaGittSted(String gittSted) {
        ArrayList<Arrangement> funnet = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getSted().equalsIgnoreCase(gittSted)) {
                funnet.add(arr);
            }
        }
        return funnet;
    }

    public ArrayList<Arrangement> finnArrPaaGittDato(long gittDato) {
        ArrayList<Arrangement> resultat = new ArrayList<>();
        
        for (Arrangement arr : arrangementer) {
            if (arr.getTidspunkt() / 10000 == gittDato) {
                resultat.add(arr);
            }
        }
        return resultat;
    }

    public ArrayList<Arrangement> finnArrMellomToDatoer(long dato1, long dato2) {
        ArrayList<Arrangement> resultat = new ArrayList<>();

        for (Arrangement arr : arrangementer) {
            if (arr.getTidspunkt() >= dato1 && arr.getTidspunkt() <= dato2) {
                resultat.add(arr);
            }
        }
        return resultat;
    }

   public ArrayList<Arrangement> sorterEtterTidspunkt() {
        ArrayList<Arrangement> kopi = new ArrayList<>(arrangementer);
        Collections.sort(kopi, Comparator.comparing(Arrangement::getTidspunkt));
        return kopi;
    } 

    public ArrayList<Arrangement> sorterEtterSted() {
        ArrayList<Arrangement> kopi = new ArrayList<>(arrangementer);
        Collections.sort(kopi, Comparator.comparing(Arrangement::getSted));
        return kopi;
    } 

    public ArrayList<Arrangement> sorterEtterType() {
        ArrayList<Arrangement> kopi = new ArrayList<>(arrangementer);
        Collections.sort(kopi, Comparator.comparing(Arrangement::getType));
        return kopi;
    } 
}
