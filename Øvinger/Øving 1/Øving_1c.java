import java.util.Scanner; //til Scanner
import static javax.swing.JOptionPane.*; //til Showinputdialog

 //Oppgave 3
 public class Øving_1c {
    public static void main(String[] args){
        String sekunderLest = showInputDialog("Sekunder: ");
        int sek = Integer.parseInt(sekunderLest);

        if(sek >= 3600){ //kode for hvis vi har timer
            int timer = sek / 3600;
            int sekEtterTimerFunnet = sek % 3600;
            int minutter = sekEtterTimerFunnet / 60;
            int sekRest = sekEtterTimerFunnet % 60;

            showMessageDialog(null, sek + " sekunder blir " + timer + " timer, " + minutter + "minutter og " + sekRest + " sekunder.");
        }
        else if (sek >= 60){ //kode for hvis vi har minutter men ikke timer
            int minutter = sek / 60;
            int sekRest = sek % 60;

            showMessageDialog(null, sek + " sekunder blir " + minutter + " minutter og " + sekRest + " sekunder.");
        }
        else {
            showMessageDialog(null, "Det du skrev inn er enten ugyldig eller under 60 sekunder");
        }
    } 
 } 