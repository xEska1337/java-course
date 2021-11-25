package pl.teslachorzow.afirstproject.eproject;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 1, 7, 8, 95};
        int[] reverse = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            reverse[i] = numbers[numbers.length-i-1];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse));


    }
}
