import java.util.Scanner; //til Scanner
import static javax.swing.JOptionPane.*; //til Showinputdialog

//Oppgave 2
public class Øving_1b {
    public static void main(String[] args) {
        final double SEKUNDER_I_TIMER = 3600;
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv antall timer: ");
        int antallTimer = in.nextInt();
        double sek_timer = SEKUNDER_I_TIMER * antallTimer;

        final double SEKUNDER_I_MINUTTER = 60;
        System.out.println("Skriv antall minutter: ");
        int antallMinutter = in.nextInt();
        double sek_minutter = SEKUNDER_I_MINUTTER * antallMinutter;

        final double SEKUNDER_I_SEKUNDER = 1;
        System.out.println("Skriv antall sekunder: ");
        int antallSekunder = in.nextInt();
        double sek_sekunder = SEKUNDER_I_SEKUNDER * antallSekunder;
            System.out.println(sek_sekunder + sek_minutter + sek_timer);
    }
}