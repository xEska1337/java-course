package pl.teslachorzow.afirstproject.kproject;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        getInfo();
    }

    public static void getInfo(){
        Scanner scanner = new Scanner(System.in);
        String[] data = new String[2];
        System.out.println("Podaj imię:");
        data[0] = scanner.next();
        System.out.println("Podaj wiek:");
        data[1] = scanner.next();

        System.out.println(data[0] + " ma " + data[1] + " lat ");
    }
}
