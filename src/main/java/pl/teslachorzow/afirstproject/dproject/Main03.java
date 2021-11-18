package pl.teslachorzow.afirstproject.dproject;

public class Main03 {
    public static void main(String[] args) {
        int[] numbers = {4, 643, 112, 9999, 69};
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
