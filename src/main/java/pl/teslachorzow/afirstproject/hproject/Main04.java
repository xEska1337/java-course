package pl.teslachorzow.afirstproject.hproject;

public class Main04 {
    public static void main(String[] args) {
        int[][] task4Array = {
                { 2, 3, 4, 6 },
                { 12, 32, 12, 11 },
                { 3, 2, 1, 4 },
                { 5, 1, 6, 7 } };

        int a = 0;

        for (int i=0; i<task4Array.length; i++){
            a += task4Array[i][i];
        }
        System.out.println(a);
    }
}
