package pl.teslachorzow.afirstproject.gproject;

public class Main07 {
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(3));
    }

    public static String checkEvenOdd(int number){
        if (number % 2 == 0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }
}
