package pl.teslachorzow.afirstproject.jproject;

public class Main02 {
    public static void main(String[] args) {
        String str = "Marty McFly,Dr. Emmett Brown,Biff Tannen,Jennifer Parker,George McFly,Lorraine Baines McFly";
        String[] parts = str.split(",");
        for (int i=0; i< parts.length;i++){
            System.out.println(parts[i]);
        }
    }
}
