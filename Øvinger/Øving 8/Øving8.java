import java.util.Scanner;

public class Øving8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person person1 = new Person("Per", "Olsen", 1983);
        ArbTaker arbTaker1 = new ArbTaker(person1, 2000, 1999, 78093.12,12.3);

        while (true) {
            System.out.println("Hva ønsker du å gjøre med arbeidstakeren?");
            System.out.println("1) Finne ut hvor mange kroner arbeidstakeren trekkes i skatt per måned");
            System.out.println("2) Finnne bruttolønn per år");
            System.out.println("3) Finne skatteetrekk per år");
            System.out.println("4) Finne navn på arbeidstakeren");
            System.out.println("5) Finne alderen til arbeidstakeren");
            System.out.println("6) Finne ut hvor mange år arbeidstakeren har vært ansatt i bedriften");
            System.out.println("7) Finne ut om arbeidstakeren har vært ansatt mer enn et gitt antall år");
            System.out.println("8) Endre månedslønn eller skatteprosent");
            int valg = input.nextInt();

            switch (valg) {
                case 1: System.out.println("Antall kroner arbeidstakeren trekkes " + arbTaker1.skatteTrekk() + " kroner skatt i måneden!");
                        break;
                case 2: System.out.println("Bruttolønn per år er " + arbTaker1.bruttoLoennPerAar() + " kroner");
                        break;
                case 3: System.out.println("Skattetrekk per år er " + arbTaker1.skatteTrekkPerAar() + " kroner!");
                        break;
                case 4: System.out.println("Navnet til arbeidstakeren er " + arbTaker1.getHeleNavn() + "!");
                        break;
                case 5: System.out.println("Arbeidstakeren er " + arbTaker1.getAlder() + " år gammel!");
                        break;
                case 6: System.out.println("Antall år arbeidstakeren har vært ansatt i bedriften er " + arbTaker1.antallAarAnsatt() + " år!");
                        break;
                case 7: System.out.println("Hvor mange år ønsker du å sjekke om arbeidstakeren har vært ansatt mer enn?");
                        int antall_aar = input.nextInt();
                        if (antall_aar <= arbTaker1.getAnsattelsesaar()) {
                            System.out.println("Arbeidstakeren har jobbet fler år enn " + antall_aar + "!");
                        }
                        else {
                            System.out.println("Arbeidstakeren har ikke jobbet fler år..");
                        }
                        break;
                case 8: System.out.println("Vil du endre på \n1) Månedslønn? \n2) Skatteprosent?");
                        int ønske = input.nextInt();
                        switch (ønske) {
                            case 1: System.out.println("Hva vil du endre månedslønnen til?");
                                    double nyLoenn = input.nextDouble();
                                    arbTaker1.setMaanedsloenn(nyLoenn);
                                    System.out.println("Den nye lønnen er nå " + arbTaker1.getMaanedsloenn() + " kroner!");
                                    break;
                            case 2: System.out.println("Hva vil du endre skatteprosenten til?");
                                    double nyProsent = input.nextDouble();
                                    arbTaker1.setSkatteprosent(nyProsent);
                                    System.out.println("Den nye skatteprosenten er nå " + arbTaker1.getSkatteprosent() + " %");
                                    break;
                        }
                case 9: break;
            }     
        }
    }
}
