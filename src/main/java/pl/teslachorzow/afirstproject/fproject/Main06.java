package pl.teslachorzow.afirstproject.fproject;

public class Main06 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);


        for (int a = 1; a <= n; a++) {
            for (int i = 1; i <= n; i++) {
                System.out.println(a + " " + "x" + " " + i + " " + "=" + " " + (a * i));
            }
            System.out.print("\n");
        }

    }
}
