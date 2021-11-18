package pl.teslachorzow.afirstproject.dproject;

public class Main07 {
    public static void main(String[] args) {
        double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 100, 0};
        double avg = 0;

        for (int i=0; i<temps.length; i++) {
            temps[i] = temps[i] * 1.8 + 32;
            avg += temps[i];
        }
        avg = avg / temps.length;
        String avgg = String.format("%.2f", avg);
        System.out.println("średnia:" + avgg);


    }
}
