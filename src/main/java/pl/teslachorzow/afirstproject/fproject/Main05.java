package pl.teslachorzow.afirstproject.fproject;

public class Main05 {
    public static void main(String[] args) {
        int point = Integer.parseInt(args[0]);

        if (point < 0 || point > 100){
            System.out.println("BADVALUE");
        }
        else if (point <= 50){
            System.out.println("Grade: F");
        }
        else if (point >= 51 && point <= 70){
            System.out.println("Grade: E");
        }
        else if (point >= 71 && point <= 90){
            System.out.println("Grade: C");
        }
        else if (point >= 91 && point <= 100){
            System.out.println("Grade: A");
        }

    }
}
