package pl.teslachorzow.afirstproject;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class Main03 {
    public static void main(String[] args) {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        for(int i = 0; i <3; i++){
            System.out.println(jokes.getRandomQuote());
        }
/*        for(;;){
            System.out.println(jokes.getRandomQuote());
        }*/
    }
}
