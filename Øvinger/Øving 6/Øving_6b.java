import static javax.swing.JOptionPane.*;

public class Øving_6b {
    public static void main(String[] agrs) {
    
        TekstAnalyse teksten = new TekstAnalyse("Hei, dette er en tekst for at du skal kunne gjøre ting med den!");
        String ønskeLest = showInputDialog(null, "Teksten er: \n"+ teksten.getTekst() + "\n\nHva vil du gjøre med teksten?\n \n1) Finne antall ulike bokstaver i teksten\n2) Finne totalt antall bokstaver\n3) Se hvor stor del av teksten som ikke er bokstaver\n4) Finne antall forekomster av en spesifikk bokstav\n5) Hvilke(n) bokstav som forekommer oftest i teksten");
        int ønske = Integer.parseInt(ønskeLest);
        if (ønske == 1) {
            showMessageDialog(null, "Antall ulike bokstaver det er i teksten er " + teksten.AntallUlikeBokstaver() + ".");
        }

        else if (ønske == 2) {
            showMessageDialog(null,"Totalt antall bokstaver er " + teksten.TotaltAntallBokstaver() + "!");
        }
        
        else if (ønske == 3) {
            showMessageDialog(null, "Prosentandelen av teksten som ikke er bokstaver, er " + teksten.AndelIkkeBokstaver() + "%.");
        }

        else if (ønske == 4) {
            String nyttØnske = showInputDialog(null, "Hvilken bokstav ønsker du å finne antall av i teksten?\nSkriv en bokstav fra a til å!");
            char bokstaven = nyttØnske.toLowerCase().charAt(0);
            
            showMessageDialog(null, "Bokstaven " + bokstaven + " kommmer i teksten totalt " + teksten.SpesifikkBokstav(bokstaven) + " ganger");
        }

        else if (ønske == 5) {
            showMessageDialog(null,"Bokstaven som dukker opp oftest er " + teksten.BokstavOftest() + "!");
        }

        else {
            showMessageDialog(null, "Velg et av tallene fra 1-5!");

        }
    }
}
