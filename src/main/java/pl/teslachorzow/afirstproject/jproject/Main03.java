package pl.teslachorzow.afirstproject.jproject;

public class Main03 {
    public static void main(String[] args) {
        System.out.println(countWords("Ijaijaijaije\n" +
                "\n" +
                "Wiatr samotnik\n" +
                "Co przed siebie naprzód ciągle gna\n" +
                "Dość już ma samotnych nocy\n" +
                "Smutek dobrze zna\n" +
                "Chce odnaleźć swoją miłość\n" +
                "Nasz samotny wiatr\n" +
                "Więc pewnego dnia\n" +
                "Dziewczynie pięknej serce skradł\n" +
                "\n" +
                "Aaaa jaj, jaj, jaj psotny wiatr\n" +
                "Aaaa jaj, jaj, jaj serce skradł\n" +
                "Aaaa jaj, jaj, jaj pognał w świat\n" +
                "Aaaa jaj, jaj, jaj psotny wiatr\n" +
                "\n" +
                "Zakochany wiatr\n" +
                "Wesoło tańczy pośród drzew\n" +
                "Cały świat usłyszy dziś\n" +
                "Radosny jego śpiew\n" +
                "A dziewczyna szuka wiatru\n" +
                "W polu roni łzy\n" +
                "Psotny wiatr jej ukradł serce\n" +
                "I spokojne sny\n" +
                "\n" +
                "Aaaa jaj, jaj, jaj psotny wiatr\n" +
                "Aaaa jaj, jaj, jaj serce skradł\n" +
                "Aaaa jaj, jaj, jaj pognał w świat\n" +
                "Aaaa jaj, jaj, jaj psotny wiatr\n" +
                "\n" +
                "Ijaijaijaije\n" +
                "\n" +
                "Aaaa jaj, jaj, jaj psotny wiatr\n" +
                "Aaaa jaj, jaj, jaj serce skradł\n" +
                "Aaaa jaj, jaj, jaj pognał w świat\n" +
                "Aaaa jaj, jaj, jaj psotny wiatr\n" +
                "\n" +
                "Aaaa jaj, jaj, jaj psotny wiatr\n" +
                "Aaaa jaj, jaj, jaj serce skradł\n" +
                "Aaaa jaj, jaj, jaj pognał w świat\n" +
                "Aaaa jaj, jaj, jaj psotny wiatr"));
    }

    public static int countWords(String str){
        String[] parts = str.split("\\s");
        return parts.length;
    }
}
