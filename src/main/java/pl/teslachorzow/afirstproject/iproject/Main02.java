package pl.teslachorzow.afirstproject.iproject;

public class Main02 {
    public static void main(String[] args) {
        String napis = "Nikola Tesla";
        System.out.println(charPos(napis));

    }

    public static int charPos(String str){
        char[] charArray = str.toCharArray();

        for (int i=0; i<charArray.length;i++){
            if (charArray[i]=='s'){
                return i;
            }
        }
        return 0;
    }
}
