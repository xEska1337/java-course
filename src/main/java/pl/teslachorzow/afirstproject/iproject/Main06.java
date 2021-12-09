package pl.teslachorzow.afirstproject.iproject;

public class Main06 {
    public static void main(String[] args) {
        String str = "Nikola";

        char[] text = str.toCharArray();
        char[] reversed = new char[text.length];
        int a = text.length-1;

        for (int i=0; i< text.length;i++){
            reversed[a] = text[i];
            a--;
        }
        System.out.println(String.valueOf(reversed));
    }
}
