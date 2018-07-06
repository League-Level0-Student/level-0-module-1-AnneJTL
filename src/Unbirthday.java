import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.time.LocalDate;

public class Unbirthday {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int mois, jour;
        jour = valsaisie("Quel jour est tu nés? ", 1, 31);
        mois = valsaisie("Quel mois est tu nés? ", 1, 12);

        LocalDate anniversary = LocalDate.of(LocalDate.now().getYear(), mois, jour);

        if (today.equals(anniversary)){
            JOptionPane.showMessageDialog(null, "Happy Anniversary !!!");
        } else {
            JOptionPane.showMessageDialog(null, "Happy UnAnniversary !!!");

        }
    }

    private static int valsaisie(String question, int valMin, int valMax){
        int valeur;
        String laValeur;
        do {
            laValeur = JOptionPane.showInputDialog(question);
            try {
                valeur = Integer.parseInt(laValeur);
            } catch (NumberFormatException e) {
                valeur = 0;
                System.out.println(e);
            }
        } while ((valeur < valMin) || (valeur > valMax));

        return valeur;
    }


}
