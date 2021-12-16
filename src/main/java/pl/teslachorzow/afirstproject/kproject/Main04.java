package pl.teslachorzow.afirstproject.kproject;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        rowsColumns();
    }

    public static void rowsColumns(){
        int rows = 0;
        int columns = 0;

        System.out.println("Podaj liczbe wierszy:");
        rows = readAndParse();

        System.out.println("Podaj liczbe kolumn:");
        columns = readAndParse();

        int[] [] prime = new int[rows] [columns];

        int a = 1;
        for (int i=0; i< prime.length;i++){
            for (int j=0; j< prime[i].length;j++){
                prime[i][j] = a;
                a++;
            }
        }

        int sum = 0;
        for (int i=0; i< prime.length;i++){
            for (int j=0; j< prime[i].length;j++){
                sum += prime[i][j];
            }
        }

        System.out.println("Liczba elementow w tablicy: " + (a-1));
        System.out.println("Suma elementow w tablicy: " + sum);
        System.out.println("Srednia elementow w tablicy: " + (sum/(a-1)));

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
