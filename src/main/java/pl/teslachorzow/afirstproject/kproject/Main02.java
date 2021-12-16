package pl.teslachorzow.afirstproject.kproject;

import org.springframework.util.ExceptionTypeFilter;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        operations();
    }

    public static void operations(){
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[2];

        System.out.println("Podaj liczbe:");
        try{
            number[0] = Integer.parseInt(scanner.next());
        }
        catch (NumberFormatException e){
            System.out.println("!!!Podaj liczbe a nie litery!!!");
        }

        System.out.println("Podaj druga liczbe:");
        try{
            number[1] = Integer.parseInt(scanner.next());
        }
        catch (NumberFormatException e){
            System.out.println("!!!Podaj liczbe a nie litery!!!");
        }

        System.out.println("Dodawanie:" + (number[0] + number[1]));
        System.out.println("Odejmowanie:" + (number[0] - number[1]));
        System.out.println("Mnozenie:" + (number[0] * number[1]));
        System.out.println("Dzielenie:" + (number[0] / number[1]));
    }
}
