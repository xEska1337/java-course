package pl.teslachorzow.afirstproject.lproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        File file = new File("text4.txt");
        try {
            Scanner scanner = new Scanner(file);
            String scan = " ";
            while (scanner.hasNextLine()){
                scan = scanner.nextLine();
                if(scan.toLowerCase(Locale.ROOT).contains("javy")){
                    System.out.println(scan);
                }
            }
        } catch (FileNotFoundException ex){
            System.out.println("Brak pliku");
        }
    }
}
