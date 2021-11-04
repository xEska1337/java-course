package pl.teslachorzow.afirstproject.afirstproject;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class Main02 {
    public static void main(String[] args) {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.println(jokes.getRandomQuote());
    }
}
