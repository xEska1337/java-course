package pl.teslachorzow.afirstproject.lproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        File file = new File("text1.txt");
        StringBuilder read = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                read.append(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException ex){
            System.out.println("Brak pliku");
        }

        System.out.println(read.toString());
    }
}
