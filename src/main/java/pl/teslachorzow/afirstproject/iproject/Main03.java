package pl.teslachorzow.afirstproject.iproject;

public class Main03 {
    public static void main(String[] args) {
        String napis = "NikolaTesla";
        System.out.println(firstWord(napis));
        System.out.println(fistHalf(napis));

    }

    public static String firstWord(String str){
        char[] charArray = str.toCharArray();

        for (int i=0; i< charArray.length;i++){
            if (Character.isUpperCase(charArray[i]) && i != 0){
                return str.substring(0, i);
            }
        }
        return " ";
    }

    public static String fistHalf(String str){
        int a = str.length();
        return str.substring(0, a/2);
    }
}
