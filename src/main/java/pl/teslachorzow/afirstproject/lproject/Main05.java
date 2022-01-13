package pl.teslachorzow.afirstproject.lproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main05 {
    public static void main(String[] args) {
        File file = new File("text5.txt");
        List<String> list = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                list.add(scanner.nextLine());
            }
            Collections.sort(list);
            list.forEach(System.out::println);
        } catch (FileNotFoundException ex){
            System.out.println("Brak pliku");
        }
    }
}
