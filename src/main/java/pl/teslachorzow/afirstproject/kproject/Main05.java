package pl.teslachorzow.afirstproject.kproject;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        textLines();
    }

    public static void textLines(){
        Scanner scanner = new Scanner(System.in);
        String scan = " ";
        boolean run = true;
        while (run != false){
            scan = scanner.next();
            if(scan.equals("quit")){
                run = false;
            }
            else {
                System.out.println(scan);
            }
        }
        System.out.println("Koniec");
    }
}
