package pl.teslachorzow.afirstproject.lproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        File file = new File("text3.txt");
        String scan = " ";
        int suma = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.next().replace(",",""));
                //scan = scanner.next().replace(",","");

                //suma += scanner.nextDouble();
            }
        } catch (FileNotFoundException ex){
            System.out.println("Brak pliku");
        }

    }
}
