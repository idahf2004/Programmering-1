import static javax.swing.JOptionPane.*; // til input

public class Øving_2a {
    public static void main(String[] args){
        String årLest = showInputDialog("År: ");
        int år = Integer.parseInt(årLest);

        if (år % 400 == 0){
            showMessageDialog(null, år + " er et skuddår!");
        }

        else if (år % 100 == 0){
            showMessageDialog(null, år + " er IKKE et skuddår!");
        }

        else if (år % 4 == 0){
            showMessageDialog(null, år + " er et skuddår!");
        }

        else {
            showMessageDialog(null, år + " er IKKE et skuddår!");
        }
    }
}
