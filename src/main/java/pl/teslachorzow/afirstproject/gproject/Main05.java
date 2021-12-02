package pl.teslachorzow.afirstproject.gproject;

public class Main05 {
    public static void main(String[] args) {
        System.out.println(calculateNetto(50, 0.23));
    }

    public static double calculateNetto(double gross, double vat){
        return gross - gross * vat;
    }
}
