package pl.teslachorzow.afirstproject.fproject;

public class Main03 {
    public static void main(String[] args) {
        double average = 0;
        for (int i = 0; i < args.length; i++){
            average += Integer.parseInt(args[i]);
        }
        average = average / args.length;

        System.out.println(String.format("%.2f", average));
    }
}
