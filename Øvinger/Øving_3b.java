import static javax.swing.JOptionPane.*;


public class Øving_3b {
    public static void main(String[] args) {
        for (int count = 0; count <5; count++ ){
            boolean erPrimtall = true;
            String tallLEST = showInputDialog("Skriv et tall, så sjekker vi om det er primtall: ");
            int tall = Integer.parseInt(tallLEST);
                if (tall <= 1) {
                    erPrimtall = false;
                }  else {
                    for (int i = 2; i < tall; i++){
                        if (tall % i == 0){
                            erPrimtall = false;
                            break; 
                        }
                    }
                }
                if (erPrimtall){
                    showMessageDialog(null, tall + " er et primtall!!");
                } else {
                    showMessageDialog(null, tall + " er IKKE et primtall!");
                }
    
        }
    }
}