package pl.teslachorzow.afirstproject.jproject;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        System.out.println(onlyTwoElements("Java-zadania-podzial-napisow","-"));
    }

    public static String onlyTwoElements(String str, String separator){
        String[] parts = str.split(separator,2);
        return Arrays.toString(parts);
    }
}
