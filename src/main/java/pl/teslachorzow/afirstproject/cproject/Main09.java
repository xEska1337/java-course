package pl.teslachorzow.afirstproject.cproject;

public class Main09 {
    public static void main(String[] args) {
        int n =5;
        for (int i =0; i<n;i++){
            String row = "";

            for (int j =0; j<n; j++){
                if (i >= j) {
                    row += " *";
                }
                else {
                    row += " " + (j+1);
                }
            }
            System.out.print(row + "\n");
        }

        for (int i = n; i>=0;i--){
            String row = "";

            for (int j =0; j<n; j++){
                if (i >= j) {
                    row += " *";
                }
                else {
                    row += " " + (j+1);
                }
            }
            System.out.print(row + "\n");
        }
    }
}
