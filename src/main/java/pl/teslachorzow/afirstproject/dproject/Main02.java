package pl.teslachorzow.afirstproject.dproject;

public class Main02 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "berry"};

        System.out.println(fruits[0]);

        int n = fruits.length;
        System.out.println(fruits[n - 1]);

        for (int i=0; i< fruits.length; i++){
            System.out.print(fruits[i]+ ",");
        }
    }
}
