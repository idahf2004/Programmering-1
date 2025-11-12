import javax.swing.JOptionPane;

public class Øving_3a {
    public static void main(String[] args) {
        double[] gangetabellen = linspace(1, 10, 10);

        String tallLest = JOptionPane.showInputDialog("Velg et tall av 13, 14 og 15: ");
        int tall = Integer.parseInt(tallLest);

        if (tall == 13) {
            for (double verdi : gangetabellen) {
                System.out.println("13 * " + verdi + " = " + (verdi * 13));
            }  
        } else if (tall == 14) {
            for (double verdi : gangetabellen) {
                System.out.println("14 * " + verdi + " = " + (verdi * 14));
            }
        } else if (tall == 15) {
            for (double verdi : gangetabellen) {
                System.out.println("15 * " + verdi + " = " + (verdi * 15));
            }
        } else {
            System.out.println("Ugyldig svar. Velg 13, 14 eller 15.");
        }
    }

    public static double[] linspace(double start, double end, int num) {
        double[] result = new double[num];
        double step = (end - start) / (num - 1);

        for (int i = 0; i < num; i++) {
            result[i] = start + step * i;
        }

        return result;
    }
}
