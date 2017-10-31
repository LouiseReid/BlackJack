package com.example.louisereid.snap;

/**
 * Created by louisereid on 31/10/2017.
 */

public class BJRunner {


    public static void main(String[] args) {
        Player player = new Player("Player 1");
        Deck deck = new Deck();
        Dealer dealer = new Dealer("Dealer", deck);
        Game game = new Game(player, dealer, deck);
        game.start();
    }
}
