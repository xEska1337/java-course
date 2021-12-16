package pl.teslachorzow.afirstproject.kproject;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        System.out.println("1. Zamiana brutto na netto");
        System.out.println("2. Zamiana netto na brutto");
        int menu = readAndParse();
        if (menu == 1){
            bruttoNetto();
        }else if (menu == 2){
            nettoBrutto();
        }
    }

    public static void bruttoNetto(){
        Scanner scanner = new Scanner(System.in);
        double brutto = 0;
        String scan = " ";

        boolean run = true;
        while (run != false){
            System.out.println("Wpisz quit aby zakonczyc");
            System.out.println("Wpisz wartosc brutto: ");
            scan = scanner.next();
            if (scan.equals("quit")){
                run = false;
            }else {
                try {
                    brutto = Integer.parseInt(scan);
                }catch (NumberFormatException e){
                    System.out.println("!!!Podaj liczbe a nie litery!!!");
                }
                double netto = brutto;
                netto -= (brutto * 0.23);
                System.out.println("Wartosc netto: " + netto);
            }
        }
    }

    public static void nettoBrutto(){
        Scanner scanner = new Scanner(System.in);
        double netto = 0;
        String scan = " ";

        boolean run = true;
        while (run != false){
            System.out.println("Wpisz quit aby zakonczyc");
            System.out.println("Wpisz wartosc netto: ");
            scan = scanner.next();
            if (scan.equals("quit")){
                run = false;
            }else {
                try {
                    netto = Integer.parseInt(scan);
                }catch (NumberFormatException e){
                    System.out.println("!!!Podaj liczbe a nie litery!!!");
                }
                double brutto = netto;
                brutto += (netto * 0.23);
                System.out.println("Wartosc netto: " + brutto);
            }
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
