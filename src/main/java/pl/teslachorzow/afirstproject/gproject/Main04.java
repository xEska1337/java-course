package pl.teslachorzow.afirstproject.gproject;

public class Main04 {
    public static void main(String[] args) {

        System.out.println(createName("Szymon", "szymon", "hej"));

    }

    public static String createName(String name, String surname, String nickname){
        return String.join(" ", name, nickname, surname);
        //return name + " " + nickname + " " + surname;
    }
}
