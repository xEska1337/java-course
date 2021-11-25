package pl.teslachorzow.afirstproject.eproject;

import java.util.Arrays;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        int[] randNumbers = new int[20];
        Random random = new Random();
        int min = 0;

        for (int i=0; i < randNumbers.length; i++){
            randNumbers[i] = random.nextInt(101);
        }
        Arrays.sort(randNumbers);
        System.out.println(randNumbers[0]);
    }
}
