package pl.teslachorzow.afirstproject.iproject;

public class Main07 {
    public static void main(String[] args) {
        String str = "kobyła ma mały bok";
        String trim = str.replaceAll("\\s","");

        char[] text = trim.toCharArray();
        char[] reversed = new char[text.length];
        int a = text.length-1;

        for (int i=0; i< text.length;i++){
            reversed[a] = text[i];
            a--;
        }
        String b = String.valueOf(reversed);

        System.out.println(trim.equals(b));

    }
}
