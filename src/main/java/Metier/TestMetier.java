package Metier;

public class TestMetier {
    public static void main(String[] args) {
        CreditMetierImplementation mt= new CreditMetierImplementation();
        double capitale=200000;
        int duree=240;
        double taux=4.5;
        double m= mt.calculerMensualiterCredit(capitale,taux,duree);
        System.out.println(m);
    }
}
