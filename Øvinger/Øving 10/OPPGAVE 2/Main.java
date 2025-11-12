import java.util.Scanner;
import java.util.ArrayList;

//HUSK Å SPØRRE OM MAIL OM GITHUB!!!!!!!!!!!!

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MenyRegister register = new MenyRegister();

        Rett forrett1 = new Rett("Bruschetta", "Forrett", 79.0, "Ristet brød med tomat og basilikum");
        Rett hovedrett1 = new Rett("Pasta Carbonara", "Hovedrett", 189.0, "Pasta, egg, bacon, parmesan");
        Rett dessert1 = new Rett("Tiramisu", "Dessert", 89.0, "Mascarpone, kaffe, kakao");

        Rett forrett2 = new Rett("Rekecocktail", "Forrett", 95.0, "Reker, salat, dressing");
        Rett hovedrett2 = new Rett("Biff med peppersaus", "Hovedrett", 249.0, "Biff, peppersaus, poteter");
        Rett dessert2 = new Rett("Crème brûlée", "Dessert", 99.0, "Egg, fløte, sukker");

        Meny meny1 = new Meny("Italiensk kveld");
        meny1.leggTilRett(forrett1);
        meny1.leggTilRett(hovedrett1);
        meny1.leggTilRett(dessert1);

        Meny meny2 = new Meny("Fransk kveld");
        meny2.leggTilRett(forrett2);
        meny2.leggTilRett(hovedrett2);
        meny2.leggTilRett(dessert2);

        register.leggTilNyRett(forrett1);
        register.leggTilNyRett(forrett2);
        register.leggTilNyRett(hovedrett1);
        register.leggTilNyRett(hovedrett2);
        register.leggTilNyRett(dessert1);
        register.leggTilNyRett(dessert2);

        register.leggTilNyMeny(meny1);
        register.leggTilNyMeny(meny2);

        System.out.println("\nHer er menyene:");
        System.out.println("-----------------------------");
        System.out.println(meny1);
        System.out.println("-----------------------------");
        System.out.println(meny2);
        System.out.println("-----------------------------");

        while (true) {
            System.out.println("\nHva ønsker du å gjøre?");
            System.out.println("----------------------");
            System.out.println("1) Legge til en ny rett");
            System.out.println("2) Finne en rett i en meny");
            System.out.println("3) Finne en type rett");
            System.out.println("4) Legge til en meny");
            System.out.println("5) Finne menyer som er innenfor et visst budsjett");
            System.out.println("6) Avslutte programmet");
            int onske = input.nextInt();
            input.nextLine();
            

            switch (onske) {
                case 1: System.out.println("Hvilken rett ønsker du å legge til?");
                        String nyRett = input.nextLine();

                        System.out.println("Hva slags type rett er det?");
                        String typeRett = input.nextLine();

                        System.out.println("Hva skal være prisen på retten?");
                        double prisPaRett = input.nextDouble();
                        input.nextLine();

                        System.out.println("Hva er oppskriften på retten?");
                        String oppskrift = input.nextLine();

                        Rett nyttTilskudd = new Rett(nyRett, typeRett, prisPaRett, oppskrift);
                        register.leggTilNyRett(nyttTilskudd);

                        System.out.println("Her er retten din: ");
                        System.out.println(nyttTilskudd);

                        break;

                case 2: System.out.println("Hvilken rett vil du finne?");
                        String onsketRett = input.nextLine();

                        ArrayList<Meny> menyerMedRett = register.finnMenyerMedRett(onsketRett);

                        if (menyerMedRett.isEmpty()) {
                            System.out.println("\nVi tilbyr dessverre ikke denne retten! Men vi har mye annet godt:)");
                        }
                        else {
                            System.out.println("\nRetten " + onsketRett + " tilbys i:");
                            for (Meny m : menyerMedRett) {
                                System.out.println("- " + m.getNavn());
                            }
                        }

                        break;

                case 3: System.out.println("Hva slags type rett ønsker du å finne?");
                        System.out.println("\nVi har: ");
                        System.out.println("--------");
                        System.out.println("Forrett");
                        System.out.println("Hovedrett");
                        System.out.println("Dessert");
                        String typeRettOnsket = input.nextLine();

                        ArrayList<Rett> resultat = register.finnTypeRett(typeRettOnsket);

                        if (resultat.isEmpty()) {
                            System.out.println("Vi har dessverre ikke noen retter av denne typen!");
                        }
                        else {
                            System.out.println("Av typen " + typeRettOnsket + " har vi disse rettene å tilby:");
                            System.out.println("-------------------------------------------------------------");
                            for (Rett r : resultat) {
                                System.out.println("- " + r.getNavn() + " (" + r.getPris() + " kr)");
                            }
                        }

                        break;
                
                case 4: System.out.println("Du ønsker å legge til en meny! Hva skal den første retten være?");
                        String forrettTilMeny = input.nextLine();

                        System.out.println("Hva slags type rett er det?");
                        String typeRettTilMeny = input.nextLine();

                        System.out.println("Hva skal være prisen på retten?");
                        double prisPaRettTilMeny = input.nextDouble();
                        input.nextLine();

                        System.out.println("Hva er oppskriften på retten?");
                        String oppskriftTilForrettTilMeny = input.nextLine();

                        Rett forrettTilNyMeny = new Rett(forrettTilMeny, typeRettTilMeny, prisPaRettTilMeny, oppskriftTilForrettTilMeny);
                        register.leggTilNyRett(forrettTilNyMeny);

                        System.out.println("Hva skal den andre retten være?");
                        String hovedrettTilMeny = input.nextLine();

                        System.out.println("Hva slags type rett er det?");
                        String typeRettTilNyMeny = input.nextLine();

                        System.out.println("Hva skal være prisen på retten?");
                        double prisPaRettTilNyMeny = input.nextDouble();
                        input.nextLine();

                        System.out.println("Hva er oppskriften på retten?");
                        String oppskriftTilHovedrettTilMeny = input.nextLine();

                        Rett hovedretttTilNyMeny = new Rett(hovedrettTilMeny, typeRettTilNyMeny, prisPaRettTilNyMeny, oppskriftTilHovedrettTilMeny);
                        register.leggTilNyRett(hovedretttTilNyMeny);

                        System.out.println("Hva skal den andre tredje retten være?");
                        String dessertTilMeny = input.nextLine();

                        System.out.println("Hva slags type rett er det?");
                        String typeRettTilMenyen = input.nextLine();

                        System.out.println("Hva skal være prisen på retten?");
                        double prisPaRettTilMenyen = input.nextDouble();
                        input.nextLine();

                        System.out.println("Hva er oppskriften på retten?");
                        String oppskriftTilDessertTilMeny = input.nextLine();

                        Rett dessertTilNyMeny = new Rett(dessertTilMeny, typeRettTilMenyen, prisPaRettTilMenyen, oppskriftTilDessertTilMeny);
                        register.leggTilNyRett(dessertTilNyMeny);

                        System.out.println("Hva skal menyen hete?");
                        String menyNavn = input.nextLine();

                        Meny nyMeny = new Meny(menyNavn);
                        nyMeny.leggTilRett(forrettTilNyMeny);
                        nyMeny.leggTilRett(hovedretttTilNyMeny);
                        nyMeny.leggTilRett(dessertTilNyMeny);

                        System.out.println("Her er den nye menyen din!");
                        System.out.println("--------------------------");
                        System.out.println(nyMeny);

                        break;
                
                case 5: System.out.println("Hva ønsker du at minstebeløpet på menyen skal være?");
                        double minsteBelop = input.nextDouble();
                        input.nextLine();

                        System.out.println("Hva ønsker du at maksbeløpet på menyen skal være?");
                        double maksBelop = input.nextDouble();
                        input.nextLine();

                        var treff = register.totalPrisInnenforIntervall(minsteBelop, maksBelop);
                        if (treff.isEmpty()) {
                            System.out.println("Det finnes desverre ingen menyer med totalpris innenfor dine ønsker");
                        }
                        else {
                            System.out.println("Disse menyene er innenfor ditt budsjett:");
                            System.out.println("--------------------------");
                            treff.forEach(System.out::println);
                        }

                        break;
                    
                case 6: System.out.println("Avslutter programmet...");
                        return;

                default: System.out.println("Ugyldig valg, vennligst velg et tall mellom 1 og 6!");
                        break; 
            }
        }
    }
}
