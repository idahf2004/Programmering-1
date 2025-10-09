public class Øving_6a {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int[] antall = new int[10];
        
        for (int i = 0; i < 1000; i++) {
            int tall = random.nextInt(10);
            antall[tall]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Antall ganger " + i + " ble generert var " + antall[i]);
        }
    }
    
}
