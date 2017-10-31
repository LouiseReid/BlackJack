package com.example.louisereid.snap;

/**
 * Created by louisereid on 27/10/2017.
 */

public class SnapRunner {

    public static void main(String[] args) {
        Player player = new Player("Louise");
        Deck deck = new Deck();
        Dealer dealer = new Dealer("Dealer", deck);
        Snap game = new Snap(player, dealer, deck);
        System.out.println(game.start());
    }
}
