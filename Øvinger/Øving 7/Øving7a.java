import java.util.Scanner;

public class Øving7a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv en setning: ");
        String setningen = input.nextLine();
        NyString setning = new NyString(setningen);


        System.out.println("Setningen vi skal jobbe med er: " + setning.getOrd());
        System.out.println("Hva vil du gjøre med setningen?");
        System.out.println("1) Forkorte den");
        System.out.println("2) Fjerne et tegn");
        
        int valg = input.nextInt();

        switch (valg) {
            case 1: System.out.println("Den forkortede versjonen av setningen: \n" + setning.getOrd() + " er: \n" + setning.forkorting());
                    break;
            case 2: System.out.println("Hvilken bokstav vil du fjerne?");
                    char tegn = input.next().charAt(0);
                    System.out.println("Setningen forkortet blir: " + setning.fjerning(tegn));
                    break;
        }

    }
}