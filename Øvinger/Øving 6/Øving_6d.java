import java.util.Scanner;

public class Øving_6d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrise2 m1 = new Matrise2();

        System.out.println("Dette er matrise A: ");
        m1.skriveUt();

        System.out.println("Skriv inn " + m1.length + " rader og " + m1.length[0] + " kolonner: ");

        int[][] m2 = new int[m1.length][m1.length[0]];
        for (int rader = 0; rader < m1.length; rader++) {
            for (int kolonner = 0; kolonner < m1.length[0]; kolonner++) {
                m2[rader][kolonner] = input.nextInt();
            }
        }

        for (int rader = 0; rader < m2.length; rader++) {
            for (int kolonner = 0; kolonner < m2.length[0]; kolonner++) {
                System.out.print(m2[rader][kolonner] + " ");
            }
            System.out.println();
        }

        
        System.out.print("Hva vil du gjøre med de to matrisene?
        1) Addere de
        2) Multiplisere de
        3) Transponere matrise A
        
        Skriv inn et tall fra 1 - 3: ");
    }
}
