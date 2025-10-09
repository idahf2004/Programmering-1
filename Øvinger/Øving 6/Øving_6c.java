import java.util.Scanner;

public class Øving_6c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[][] m1 = {
            {1, 2},
            {3, 4}
        };

        Matrise A = new Matrise(m1);

        System.out.println("Hvor mange rader skal matrise B ha?");
        int r1 = input.nextInt();

        System.out.println("Hvor mange kolonner skal matrise B ha?");
        int k1 = input.nextInt();
        double[][] m2 = new double[r1][k1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < k1; j++) {
                System.out.print("Skriv inn element [" + i + "][" + j + "] for matrise B:");
                   m2[i][j] = input.nextDouble();
                
            }
        }

        Matrise B = new Matrise(m2);

        System.out.println("\n\nMatrisene er: \nMatrise A = \n" + A + 
        "\nMatrise B = \n" + B + 
        "\nHva ønsker du å gjøre med matrisene?\n\n" + 
        "1) Addere de\n2) Multiplisere de\n3) Transponere matrise A\n\n" + 
        "Skriv et tall fra 1-3!"
        );

        int ønske = input.nextInt();

        if (ønske == 1) {
            System.out.println("Resultatet av matrisene addert sammen er\n" + "Matrise C = \n" + A.addere(B));
        }
        else if (ønske == 2) {
            System.out.println("Resultatet av matrisene multiplisert sammen er\n" + "Matrise C = \n" + A.multiplisere(B));
        }
        else if (ønske == 3) {
            System.out.println("Resultatet av matrise A transponert er\n" + "Matrise C = \n" + A.transponere());
        }
    }
}
