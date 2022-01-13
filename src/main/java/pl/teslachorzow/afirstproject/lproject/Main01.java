package pl.teslachorzow.afirstproject.lproject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scan = " ";
        boolean doing = true;
        try (PrintWriter printWriter = new PrintWriter("text1.txt")){
            while (doing != false){
                scan = scanner.next();
                if (scan.equals("quit")){
                    doing = false;
                } else {
                    printWriter.println(scan);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Blad zapisu");
        }
    }
}
