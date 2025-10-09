import java.util.Scanner;

class Brok {
    private int teller;
    private int nevner; 

    public Brok (int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException ("Nevner kan ikke være 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public Brok (int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller () {
        return teller;
    }

    public int getNevner () {
        return nevner;
    }

    public Brok sum (Brok annen) {
        int nyTeller = this.teller * annen.nevner + annen.teller * this.nevner; 
        int nyNevner = this.nevner * annen.nevner;
        return new Brok(nyTeller, nyNevner);
    }

    public Brok subtraksjon (Brok annen) {
        int nyTeller = this.teller * annen.nevner - annen.teller * this.nevner;
        int nyNevner = this.nevner * annen.nevner; 
        return new Brok(nyTeller, nyNevner);
    }

    public Brok multiplikasjon (Brok annen) {
        int nyTeller = this.teller * annen.teller;
        int nyNevner = this.nevner * annen.nevner;
        return new Brok(nyTeller, nyNevner);
    }

    public Brok divisjon (Brok annen) {
        int nyTeller = this.teller * annen.nevner;
        int nyNevner = this.nevner * annen.teller;
        return new Brok(nyTeller, nyNevner);
    }
    @Override
    public String toString() {
        return teller + "/" + nevner;
    }
}

public class Øving_5a {
    public static void main(String[] args) {
        Brok b1 = new Brok(1, 2);
        Brok b2 = new Brok(2);

        Scanner in = new Scanner(System.in);
        System.out.println("Hva vil du gjøre med brøkene?\n 1) Summere de\n 2) Subtrahere de \n 3) Multiplisere de \n 4) Dividere de \n Velg et tall fra 1-4");
        int tallLest = in.nextInt();

        if (tallLest == 1) {
            Brok summen = b1.sum(b2);
            System.out.println("Brøken " + b1 + " summert med " + b2 + " er lik " + summen);
        }
        else if(tallLest == 2) {
            Brok summen = b1.subtraksjon(b2);
            System.out.println("Brøken " + b1 + " subtrahert fra " + b2 + " er lik " + summen);
        }
        else if(tallLest == 3) {
            Brok summen = b1.multiplikasjon(b2);
            System.out.println("Brøken " + b1 + " multiplisert med " + b2 + " er lik " + summen);
        }
        else {
            Brok summen = b1.divisjon(b2);
            System.out.println("Brøken " + b1 + " dividert med " + b2 + " er lik " + summen);
        }
        in.close();
    }
}
