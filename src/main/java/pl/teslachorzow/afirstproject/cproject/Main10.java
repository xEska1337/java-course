package pl.teslachorzow.afirstproject.cproject;

public class Main10 {
    public static void main(String[] args) {
         long n =999999999;
        for (int i=0; i<n; i++){
            if ((i % 2) == 0){
                System.out.print(" " + i);
            }
            else {
                System.out.print(" *");
            }
        }
    }
}
