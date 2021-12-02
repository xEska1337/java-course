package pl.teslachorzow.afirstproject.gproject;

public class Main02 {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(square(num));
    }

    public static int square(int num){
        return (int) Math.pow(num, 2);
    }
}
