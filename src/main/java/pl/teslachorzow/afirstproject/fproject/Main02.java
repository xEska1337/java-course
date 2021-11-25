package pl.teslachorzow.afirstproject.fproject;

import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) {
        String[] reverse = new String[args.length];

        for (int i = 0; i < args.length; i++){
            reverse[i] = args[args.length-i-1];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
