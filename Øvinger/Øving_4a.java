import java.util.Scanner;

class Valuta {
    private String navn;
    private double kurs;

    public Valuta (String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
    }
    
    String getNavn() {
        return this.navn;
    }

    double getKurs() {
        return this.kurs;
    }

    public double tilNok (double belop) {
        return kurs * belop;
    }

    public double fraNok (double belop) {
        return belop / kurs;
    }

}

public class Øving_4a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Valuta dollar = new Valuta("Dollar", 9.8);
        Valuta euro = new Valuta("Euro", 11.6);
        Valuta svenskeKroner = new Valuta("Svenske kroner", 1.06);

        boolean fortsett = true;

        while (fortsett) {
            System.out.println("Velg valuta:\n1: Dollar\n2: Euro\n3: Svenske kroner\n4: Avslutt");
            int tallLest = in.nextInt();

            if (tallLest == 1) {
                System.out.println("Hvor stort beløp i dollar ønsker du å regne om til norske kroner?");
                double belopDollar = in.nextDouble();
                double verdi = dollar.tilNok(belopDollar);
                System.out.println(belopDollar + " " + dollar.getNavn() + " i norske kroner er " + verdi + " NOK");
            }
            
            else if (tallLest == 2) {
                System.out.println("Hvor stort beløp i euro ønsker du å regne om til norske kroner?");
                double belopEuro = in.nextDouble();
                double verdi = euro.tilNok(belopEuro);
                System.out.println(belopEuro + " " + euro.getNavn() + " i norske kroner er " + verdi + " NOK");
            }

            else if (tallLest == 3) {
                System.out.println("Hvor stort beløp i svenske kroner ønsker du å regne om til norske kroner?");
                double belopSEK = in.nextDouble();
                double verdi = svenskeKroner.tilNok(belopSEK);
                System.out.println(belopSEK + " " + svenskeKroner.getNavn() + "i norske kroner er " + verdi + " NOK");
            }

            else if (tallLest == 4) {
                fortsett = false;
            }

            else {
                System.out.println("Tallet er ugyldig. Velg et tall mellom 1 og 4!");
            }
        }

        in.close();
    }
}
