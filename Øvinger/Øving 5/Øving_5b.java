import java.util.Random;
import static javax.swing.JOptionPane.*;

class MinRandom {
    private Random random; 

    public MinRandom() { 
        random = new Random();
    }

    public int nesteHeltall (int nedre, int ovre) /*Parameter *//* intervallet (nedre, ovre) */ {
        return random.nextInt(ovre - nedre) + nedre;
    }
    
    public double nesteDesimaltall () /*intervallet >nedre, ovre> ^15 */ /*Metode*/ {
        return random.nextDouble();
    }

}

public class Øving_5b {
    public static void main(String[] args) {
        String tallLest = showInputDialog("Velg om du vil ha: \n1) Et tilfeldig heltall \n2) Et tilfeldig desimaltall fra 0 opp til, men ikke med 1. ");
        int tallInput = Integer.parseInt(tallLest);
        
        MinRandom tall = new MinRandom(); 
        
        if (tallInput == 1) {
            int heltall = tall.nesteHeltall(5, 10); 
            showMessageDialog(null, "Det tilfeldige heltallet er: " + heltall + "!!!");
        }
        else if (tallInput == 2) {
            double desimaltall = tall.nesteDesimaltall();
            showMessageDialog(null,"Det tilfeldige desimaltallet er: " + desimaltall + "!!!");
        }
        else {
            showMessageDialog(null, "Vennligst velg et tall mellom 1 og 2!");
        }
    }
}
