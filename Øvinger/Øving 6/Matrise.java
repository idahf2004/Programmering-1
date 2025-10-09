class Matrise {
    private final double[][] matrise1;

    public Matrise (double[][] matrise1) {
        int rad = matrise1.length;
        int kolonne = matrise1[0].length;
        this.matrise1 = new double[rad][kolonne];
        for (int i = 0; i < rad; i++) {
            System.arraycopy(matrise1[i], 0, this.matrise1[i], 0, kolonne);
        }
    } 

    public int rader () {
        return matrise1.length;
    }

    public int kolonner() {
        return matrise1[0].length;
    }

    public Matrise addere(Matrise matrise2) {
        if (this.rader() != matrise2.rader() || this.kolonner() != matrise2.kolonner()) {
            return null;
        }
        
        double[][] resultat = new double[rader()][kolonner()];
        for (int i = 0; i < rader(); i++) {
            for (int j = 0; j < kolonner(); j++) {
                resultat[i][j] = matrise1[i][j] + matrise2.matrise1[i][j];
            }
        }
        return new Matrise(resultat);

    }
    public Matrise multiplisere(Matrise matrise2) {
        if (this.kolonner() != matrise2.rader()) {
            return null;
        }
        
        double[][] resultat = new double[rader()][matrise2.kolonner()];
        for (int i = 0; i < rader(); i++) {
            for (int j = 0; j < matrise2.kolonner(); j++) {
                double sum = 0;
                for (int k = 0; k < kolonner(); k++)
                    sum +=matrise1[i][k] * matrise2.matrise1[k][j];
                resultat[i][j] = sum;
            }
        }
        return new Matrise(resultat);
    }

    public Matrise transponere() {
        double[][] resultat = new double[kolonner()][rader()];
        for (int i = 0; i < rader(); i++) {
            for (int j = 0; j < kolonner(); j++) {
                resultat[j][i] = matrise1[i][j];
            }
        }
        return new Matrise(resultat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] r : matrise1) {
            sb.append("[ ");
            for (double element : r) {
                sb.append(element).append(" ");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}