import java.util.Scanner;
import java.util.ArrayList;

public class Klientprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EiendomRegister register = new EiendomRegister();
        
        Eiendom A = new Eiendom(1445,"Gloppen", 77, 631, " ", 1017.6, "Jens Olsen");
        Eiendom B = new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        Eiendom C = new Eiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        Eiendom D = new Eiendom(1445, "Gloppen", 74, 188, " ", 1457.2, "Karl Ove Bråten");
        Eiendom E = new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

        register.registrerEiendom(A);
        register.registrerEiendom(B);
        register.registrerEiendom(C);
        register.registrerEiendom(D);
        register.registrerEiendom(E);

        while (true) {
            System.out.println("\nHva vil du gjøre med registeret av eiendommer?");
            System.out.println("1) Registrere/legge inn eiendom");
            System.out.println("2) Skrive ut alle eiendommer som er registrert");
            System.out.println("3) Søke etter eiendom basert på kommunenr, gnr og bnr (alle 3 samtidig)");
            System.out.println("4) Regne ut og vise gjennomsnittsareal av alle eiendommene i registeret");
            System.out.println("5) Avslutte programmet");
            
            int onske = input.nextInt();
            input.nextLine();

            switch(onske) {
                case 1: System.out.println("Hva er kommunenummeret til eiendommen du vil legge til?");
                        int kommuneNr = input.nextInt();
                        input.nextLine();

                        System.out.println("Hva er kommunenavnet til eiendommen?");
                        String kommuneNavn = input.nextLine();

                        System.out.println("Hva er gårdsnummeret til eiendommen?");
                        int gardsNummer = input.nextInt();
                        input.nextLine();

                        System.out.println("Hva er bruksnummeret til eiendommen?");
                        int bruksNummer = input.nextInt();
                        input.nextLine();

                        System.out.println("Hva er bruksnavnet til eiendommen?");
                        String bruksNavn = input.nextLine();

                        System.out.println("Hva er arealet til eiendommen?");
                        double arealTilGard = input.nextDouble();
                        input.nextLine();

                        System.out.println("Hva heter gårdseieren til eiendommen?");
                        String gardsEier = input.nextLine();

                        if (bruksNavn.isEmpty()) {
                            Eiendom nyEiendom1 = new Eiendom(kommuneNr, kommuneNavn, gardsNummer, bruksNummer, arealTilGard, gardsEier);
                            register.registrerEiendom(nyEiendom1);
                            System.out.println("Ny eiendom er lagt til i registeret:");
                            System.out.println(nyEiendom1);
                        }
                        else {
                            Eiendom nyEiendom2 = new Eiendom(kommuneNr, kommuneNavn, gardsNummer, bruksNummer, bruksNavn, arealTilGard, gardsEier);
                            register.registrerEiendom(nyEiendom2);
                            System.out.println("Ny eiendom er lagt til i registeret: ");
                            System.out.println(nyEiendom2);
                        }

                        break;

                case 2: System.out.println("Alle registrerte eiendommer:");
                        System.out.println("-------------");
                        register.skrivUtAlleEiendommer();

                        break;

                case 3: System.out.println("Hva er kommunenummeret til eiendommen du søker etter?");
                        int kommuneNummeret = input.nextInt();
                        input.nextLine();

                        System.out.println("Hva er gårdsnummeret til eiendommen du søker etter?");
                        int gardsNummeret = input.nextInt();
                        input.nextLine();

                        System.out.println("Hva er bruksnumeret til eiendommen du søker etter?");
                        int bruksNummeret = input.nextInt();
                        input.nextLine();

                        ArrayList<Eiendom> funnet = register.sokEtterEiendom(kommuneNummeret, gardsNummeret, bruksNummeret);

                        if (funnet.isEmpty()) {
                            System.out.println("Det er dessverre ikke noen eiendommer med ditt søk!");
                        }
                        else {
                            System.out.println("Eiendommen som er treff på ditt søk er:");
                            for (Eiendom e : funnet) {
                                System.out.println(e);
                            }
                        }

                        break;
                
                case 4: System.out.printf("Gjennomsnittsarealet av alle eiendommene i registeret er: %.2f kvm%n", register.gjennomsnittsAreal());
                        
                break;
                
                case 5: System.out.println("Programmet avsluttes...");
                        input.close();
                        
                        return; 

                default: System.out.println("Skriv et tall fra 1 til 5!");
                        break;
            }
        }
    }
}
