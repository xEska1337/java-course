package pl.teslachorzow.afirstproject.eproject;

import java.util.Arrays;
import java.util.Random;

public class Main06 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] secondNumbers = new int[numbers.length];
        Random random = new Random();
        for (int i =0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
            secondNumbers[i] = random.nextInt(100);
        }

        int[] sum = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            sum[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(sum));

    }
}
