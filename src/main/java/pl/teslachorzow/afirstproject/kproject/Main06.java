package pl.teslachorzow.afirstproject.kproject;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        equation();
    }

    public static void  equation(){
        int[] numbers = new int[3];
        System.out.println("Podaj liczbe a: ");
        numbers[0] = readAndParse();
        System.out.println("Podaj liczbe b: ");
        numbers[1] = readAndParse();
        System.out.println("Podaj liczbe c: ");
        numbers[2] = readAndParse();

        double delta = 0;
        double x0 = 0;
        double x1 = 0;
        double x2 = 0;
        delta = (numbers[1]*numbers[1]) + ((-4*numbers[0])*numbers[2]);
        System.out.println("Delta to: " + delta);
        if (delta < 0){
            System.out.println("Delta mniejsza od zera");
        } else if (delta == 0){
            x0 = (-numbers[1]/(2*numbers[0]));
            System.out.println("Pierwiastki:" + x0);
        } else {
            x1 = ((-numbers[1]+Math.sqrt(delta))/(2*numbers[0]));
            x2 = ((-numbers[1]-Math.sqrt(delta))/(2*numbers[0]));

            System.out.println("Pierwiastki: " + x1 + " " + x2);
        }

    }

    public static int readAndParse(){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        try {
            a = Integer.parseInt(scanner.next());
        }catch (NumberFormatException e){
            System.out.println("!!!Podaj liczbe a nie litery!!!");
        }
        return a;
    }
}
