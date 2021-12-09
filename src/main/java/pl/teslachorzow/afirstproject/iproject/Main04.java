package pl.teslachorzow.afirstproject.iproject;

public class Main04 {
    public static void main(String[] args) {
        String napis = "NikolaTesla";
        String search = "o";
        System.out.println(containStr(napis,search));
    }

    public static boolean containStr(String str, String search){
        return str.contains(search);
    }
}
