package pl.teslachorzow.afirstproject.eproject;

import java.util.Arrays;

public class Main1_1 {
    public static void main(String[] args) {
        int[] tab1 = {30, 29, 14, 42, -4, -1};
        int[] tab2 = new int[]{30, 29, 14, 42, -4, -1};

        //wyswietlanie tablicy
        System.out.println(Arrays.toString(tab1));

        //porownanie tablic
        System.out.println(Arrays.equals(tab1, tab2));

        //sortowanie tablic
        Arrays.sort(tab1);
        System.out.println(Arrays.toString(tab1));
    }
}
