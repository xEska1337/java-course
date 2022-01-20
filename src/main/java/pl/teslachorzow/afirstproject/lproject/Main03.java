package pl.teslachorzow.afirstproject.lproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        File file = new File("text3.txt");
        StringBuilder reading = new StringBuilder();
        double s = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                reading.append(scanner.nextLine() + "\n");
            }
            String string = reading.toString();
            String[] parts = string.split(",");
            for (int i = 0; i < parts.length; i++) {
                try {
                    double partDouble = Double.parseDouble(parts[i]);
                    s += partDouble;
                } catch (NumberFormatException e) {
                    System.out.println("error");
                }
            }
            System.out.println("suma: " + s);
            System.out.println(Arrays.toString(parts));
        } catch (FileNotFoundException ex){
            System.out.println("Brak pliku");
        }

    }
}







