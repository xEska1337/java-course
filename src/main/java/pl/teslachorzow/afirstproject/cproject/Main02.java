package pl.teslachorzow.afirstproject.cproject;

public class Main02 {
    public static void main(String[] args) {
        int nr1 = 3;
        int nr2 = 7;
        int nr3 = 11;


        if (nr1 > nr2 && nr1 > nr3){
            System.out.println(nr1);
        }
        else if (nr2 > nr3 && nr2 > nr1){
            System.out.println(nr2);
        }
        else {
            System.out.println(nr3);
        }
    }
}
