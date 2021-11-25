package pl.teslachorzow.afirstproject.fproject;

public class Main08 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int a = 0;
        int b = 0;

        if (y < x) {
            a = y;
        }
        else {
            a = x;
        }


        for (int i = 1; i <= a; i++){
            if  (x % i == 0 && y % i ==0){
                b = i;
            }
        }
        System.out.println(b);
    }
}
