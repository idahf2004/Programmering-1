import java.util.Random;

class Spiller {
    private int SumPoeng;
    private Random terning;

    public Spiller() {
        SumPoeng = 0;
        terning = new Random();
    }

    public int getSumPoeng() {
        return SumPoeng;
    }
    public int kastTerningen() {
        int terningkast = terning.nextInt(6) + 1;

        if (terningkast == 1) {
            SumPoeng = 0;
        }

        else if (SumPoeng < 100) {
            SumPoeng += terningkast;
        }

        else if (SumPoeng > 100) {
            SumPoeng -= terningkast;
        }

        return terningkast;
    }
}

public class Øving_4b {
    public static void main(String[] args) {

        Spiller spillerA = new Spiller();
        Spiller spillerB = new Spiller();

        boolean ferdig = false;
        int runde = 0;

        while (!ferdig) {
            runde += 1;
            int kastA = spillerA.kastTerningen();
            System.out.println("Spiller A kaster " + kastA + ". Summen av kastene er nå " + spillerA.getSumPoeng() + " på runde: " + runde);

            int kastB = spillerB.kastTerningen();
            System.out.println("Spiller B kaster " + kastB + ". Summen av kastene er nå " + spillerB.getSumPoeng() + " på runde: " + runde);

            if (spillerA.getSumPoeng() == 100) {
                System.out.println("Spiller A vant på runde " + runde + "!!!");
                ferdig = true;
            }
            else if (spillerB.getSumPoeng() == 100) {
                System.out.println("Spiller B vant på runde " + runde + "!!!");
                ferdig = true;
            }
        }
        
    }
}
