import java.util.Scanner;

public class Øving7b {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Skriv en tekst som vi kan behandle!");
        String tekstFraKlient = input.nextLine();
        Tekstbehandling teksten = new Tekstbehandling(tekstFraKlient);

        System.out.println("Hva vil du gjøre med teksten?");
        System.out.println("1) Finne antall ord i teksten");
        System.out.println("2) Finne gjennomsnittlig ordlengde");
        System.out.println("3) Finne gjennomsnittlig antall ord per periode");
        System.out.println("4) Skifte ut et ord med et annet gjennom hele teksten");
        System.out.println("5) Hente ut teksten slik den står, uten endringer");
        System.out.println("6) Hente ut teksten, men kun med store bokstaver");

        int valg = input.nextInt();

        switch (valg) {
                case 1: System.out.println("Antall ord i teksten er " + teksten.antallOrd() + " ord!");
                        break;
                case 2: System.out.println("Gjennomsnittlig ordlengde er " + teksten.gjennomsnittligOrdlengde() + ".");
                        break;
                case 3: System.out.println("Gjennomsnittlig antall ord per periode er " + teksten.gjennomsnittligAntallOrdPerPeriode() + " ord!");
                        break;
                case 4: System.out.println("Hvilket ord vil du skifte ut?");
                        String ordSomSkalByttesUt = input.next();
                        System.out.println("Hva vil du bytte ut ordet med?");
                        String bytteOrd = input.next();
                        System.out.println("Teksten er nå: " + teksten.skifteOrd(ordSomSkalByttesUt,bytteOrd));
                        break;
                case 5: System.out.println("Teksten er " + teksten.getTekst());
                        break;
                case 6: System.out.println("Teksten i kun store bokstaver er: " + teksten.tekstIStoreBokstaver());
                        break;
        }
        }
}
