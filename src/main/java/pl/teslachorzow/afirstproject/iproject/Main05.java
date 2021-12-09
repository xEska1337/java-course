package pl.teslachorzow.afirstproject.iproject;

public class Main05 {
    public static void main(String[] args) {
        String[] strings = {"Jan","beczka","papier"};
        System.out.println(stringFromArray(strings));

    }

    public static String stringFromArray(String[] str){
        String contact = " ";
        for (int i=0; i<str.length; i++){
            contact = contact.concat(str[i]);
        }
        return contact;
    }
}
