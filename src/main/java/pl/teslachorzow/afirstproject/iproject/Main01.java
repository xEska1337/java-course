package pl.teslachorzow.afirstproject.iproject;

public class Main01 {
    public static void main(String[] args) {
        String str = "Nikola Tesla – amerykański inżynier serbskiego pochodzenia";

        char ch = str.charAt(str.length()-2);
        System.out.println(ch);

        char[] charArray = str.toCharArray();
        int a = 0;

        for (int i=0; i < charArray.length; i++){
            if (charArray[i]==ch){
                a++;
            }
        }
        System.out.println(a);

    }
}
