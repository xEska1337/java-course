package pl.teslachorzow.afirstproject.kproject;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        getData();
    }

    public static void getData(){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int scan = 0;
        boolean run = true;
        while (run != false){
            try{
                scan = Integer.parseInt(scanner.next());
                if (scan == 0){
                    run = false;
                }
                else {
                    a += scan;
                    b++;
                }
            }
            catch (NumberFormatException e){
                System.out.println("!!!Podaj liczbe a nie litery!!!");
                run = false;
            }
        }
        System.out.println("Suma: " + a);
        System.out.println(b);
    }
}
