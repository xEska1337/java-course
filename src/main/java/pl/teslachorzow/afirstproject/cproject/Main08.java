package pl.teslachorzow.afirstproject.cproject;

public class Main08 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= n; j++) {
                if (i + 1 > j) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" " + j);
                }
            }
            System.out.println(" ");
        }
        for (int h = 1; h <= n; h++){

            for (int y = 1; y <= n; y++) {
                if (h + 1 > y) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" " + y);
                }
            }
            System.out.println(" ");
        }
    }
}
