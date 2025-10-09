class Matrise2 {
    private int[][] matrise1;

    public Matrise2() {
        matrise1 = new int[][] {
            {1, 2},
            {3, 4}
        };
    }

    public int[][] getMatrise1() {
        return matrise1;
    }

    public void skriveUt() {
        for (int i = 0; i < matrise1.length; i++) {
            for (int j = 0; j < matrise1[i].length; j++) {
                System.out.print(matrise1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrise2 addereMatrise(int[][] matrise2) {
        int[][] resultat = new int[matrise1.length][matrise1[0].length];
        for (int i = 0; i < matrise1.length; i++) {
            for (int j = 0; j < matrise1[0].length; j++) {
                resultat[i][j] = matrise1[i][j] + matrise2[i][j];
            }
        }
        return new Matrise2(resultat);
    }

    public 
}
