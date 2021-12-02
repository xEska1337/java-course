package pl.teslachorzow.afirstproject.gproject;

public class Main09 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        int j = n;
        for (int i=1; i<=j; i++){
            n = n * i;
        }
        return n;
    }
}
