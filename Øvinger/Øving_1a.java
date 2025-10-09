import java.util.Scanner; //til Scanner
import static javax.swing.JOptionPane.*; //til Showinputdialog

//Oppgave 1
 public class Øving_1a {
    public static void main(String[] args) {
        final double CM_I_TOMMER = 2.54; 
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv antall tommer: ");
        int antallTommer = in.nextInt();
        double cm = CM_I_TOMMER * antallTommer;
        System.out.println(cm);
    }
}