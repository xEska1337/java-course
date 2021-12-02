package pl.teslachorzow.afirstproject.gproject;

public class Main10 {
    public static void main(String[] args) {
        System.out.println(footballWin(0, 2, 3, 1));
    }

    public static String footballWin(int a1, int b1, int a2, int b2){
        double asum = 0;
        double bsum = 0;

        asum += a1 * 1;
        bsum += b1 * 1.1;

        asum += a2 * 1.1;
        bsum += b2 * 1;

        if (asum > bsum){
            return "Wygral zespol A";
        }
        else if (bsum > asum){
            return "Wygral zespol B";
        }
        else {
            return "Remis";
        }



    }
}
