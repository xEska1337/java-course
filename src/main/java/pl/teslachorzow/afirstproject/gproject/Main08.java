package pl.teslachorzow.afirstproject.gproject;

public class Main08 {
    public static void main(String[] args) {
        System.out.println(maxOfThree(10,6,5));
    }

    public static int maxOfThree(int a, int b, int c){
            if (a > b && a > c){
                return a;
            }
            else if (b > a && b > c){
                return b;
            }
            else if (c > a && c > b){
                return c;
            }
            return 0;
    }
}
