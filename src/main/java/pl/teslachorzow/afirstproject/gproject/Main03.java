package pl.teslachorzow.afirstproject.gproject;

public class Main03 {
    public static void main(String[] args) {
        double pln = 50;

        System.out.println(currencyCounter(pln));

    }

    public static double currencyCounter(double pln){
        return pln / 4.24;
    }
}
