import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrangementRegister arrangementer = new ArrangementRegister();

        Arrangement arr1 = new Arrangement(1, "Vinsmaking", "Italia", "Antonio Luigi", 202607101500L, "Mat");
        Arrangement arr2 = new Arrangement(2, "Matlagingskurs", "Kjøkkenet", "Gordon Ramsay", 202511021700L, "Mat");
        Arrangement arr3 = new Arrangement(3, "Konsert med Broiler", "Tapperiet", "Broiler", 202510221000L, "Konsert");
        Arrangement arr4 = new Arrangement(4, "Konsert med Astrid S", "Festningen", "Festningen", 202508291500L, "Konsert");
        Arrangement arr5 = new Arrangement(5, "Coldplay", "Ullevi Stadion", "Coldplay", 202606221900L, "Konsert");
        
        arrangementer.registrerArrangement(arr1);
        arrangementer.registrerArrangement(arr2);
        arrangementer.registrerArrangement(arr3);
        arrangementer.registrerArrangement(arr4);
        arrangementer.registrerArrangement(arr5);


        while (true) {
            System.out.println("\nHva ønsker du å finne ut av?");
            System.out.println("1) Registrere et nytt arrangement");
            System.out.println("2) Finne alle arrangementene på et gitt sted");
            System.out.println("3) Finne alle arrangementene på en gitt dato");
            System.out.println("4) Finne alle arrangementene innenfor et gitt tidsintervall");
            System.out.println("5) Få liste sortert etter enten sted, tidspunkt eller type arrangement");
            System.out.println("6) Avslutt!");

            int onske = input.nextInt();
            input.nextLine();

            switch (onske) {
                case 1: System.out.println("Hvilket nummer har arrangementet?");
                        int nummerPaArr = input.nextInt();
                        input.nextLine();

                        System.out.println("Hva er navnet på arrangementet?");
                        String navnPaArr = input.nextLine();

                        System.out.println("Hvor skal arrangementet holdes?");
                        String stedPaArr = input.nextLine().trim();

                        System.out.println("Hvem er arrangøren?");
                        String arrangorTilArr = input.nextLine();

                        System.out.println("Hva slags type arrangement er det?");
                        String typeArr = input.nextLine();

                        System.out.println("Hvilket tidspunkt skal arrangementet holdes på? Skriv år, måned, dato og klokkeslett");
                        long tidspunktPaArr = input.nextLong();

                        Arrangement nyttArr = new Arrangement(nummerPaArr, navnPaArr, stedPaArr, arrangorTilArr, tidspunktPaArr, typeArr);
                        arrangementer.registrerArrangement(nyttArr);

                        System.out.println("Arrangementet ble registrert! \n " + nyttArr);
                        break;

                case 2: System.out.println("Hvilket sted ønsker du å undersøke hvilke arrangementer som holdes?");
                        String stedLest = input.nextLine();
                        
                        
                        System.out.println("Arrangementene som holdes på/i " + stedLest + " er:");
                        arrangementer.finnArrPaaGittSted(stedLest).forEach(System.out::println);
                        break;
                
                case 3: System.out.println("Hvilken dato ønsker du å undersøke?");
                        long dato = input.nextLong();

                        var treff = arrangementer.finnArrPaaGittDato(dato);
                        if (treff.isEmpty()) {
                                System.out.println("Ingen arrangementer på denne datoen!");
                        }
                        else {
                                treff.forEach(System.out::println);
                        }
                        break;

                case 4: System.out.println("På hvilken dato ønsker du å undersøke fra?");
                        long dato1 = input.nextLong();
                        
                        System.out.println("På hvilken dato ønsker du å undersøke til?");
                        long dato2 = input.nextLong();

                        var treff2 = arrangementer.finnArrMellomToDatoer(dato1, dato2);
                        if (treff2.isEmpty()) {
                                System.out.println("Ingen arrangementer i dette tidsintervallet!");
                        }   
                        else {
                                treff2.forEach(System.out::println);
                        }

                        break;
                
                case 5: System.out.println("Ønsker du å sortere arrangementene etter:");
                        System.out.println("1) Sted");
                        System.out.println("2) Tidspunkt");
                        System.out.println("3) Type arrangement");

                        int svarLest = input.nextInt();
                        input.nextLine();

                        switch (svarLest) {
                            case 1 -> arrangementer.sorterEtterSted().forEach(System.out::println);

                            case 2 -> arrangementer.sorterEtterTidspunkt().forEach(System.out::println);
                            
                            case 3 -> arrangementer.sorterEtterType().forEach(System.out::println);

                            default -> System.out.println("Ugyldig valg!");
                        }
                        break;
                
                case 6: System.out.println("Avslutter programmet..");
                        return;
                        
                
                default: System.out.println("Ugyldig valg, velg et tall mellom 1 og 6!");
            } 
        }
    }
}
