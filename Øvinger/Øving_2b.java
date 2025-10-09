public class Øving_2b {
    public static void main(String[] args){
        double merkeA = (35.90 / 450);
        double merkeB = (39.50 / 500);

       if (merkeA == merkeB) {
            System.out.println("De er like rimelige!");
        }
        
        else if (merkeA < merkeB){
            System.out.println("Merke A er billigst!");
        }
        
        else {
            System.out.println("Merke B er billigst!");
        }
    }
}
