package Metier;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.ImageView;

import static org.junit.jupiter.api.Assertions.*;

class TstjUNI1 {

    private ICreditMetier metier;
    @Test
    void main() {
        metier = new CreditMetierImplementation();
        double capitale=200000;
        int duree=240;
        double taux=4.5;
        double resultatAttendu = 1265.2987;
        double resCalcul= metier.calculerMensualiterCredit(capitale,taux,duree);

        assertEquals(resultatAttendu,resCalcul,0.001);


    }
}