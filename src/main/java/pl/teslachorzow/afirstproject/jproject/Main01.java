package pl.teslachorzow.afirstproject.jproject;

public class Main01 {
    public static void main(String[] args) {
        String str = "Tesla Nikola Chorzow";
        String[] parts = str.split("\\s");
        for (int i=0; i< parts.length;i++){
            System.out.println(parts[i]);
        }
    }
}
