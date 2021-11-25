package pl.teslachorzow.afirstproject.eproject;

public class Main01 {
    public static void main(String[] args) {
        int[] mainTab = new int[50];
        String firstNumbers = " ";

        for (int i =1; i <= mainTab.length; i++){
            mainTab[i-1] = i-1;

            if (mainTab[i-1] < 10){
                 firstNumbers = "0" + mainTab[i-1] + ",";
            }
            else {
                firstNumbers = mainTab[i-1] + ",";
            }

            System.out.print(firstNumbers);

            if (i % 10 == 0){
                System.out.print("\n");
            }
        }
    }
}
