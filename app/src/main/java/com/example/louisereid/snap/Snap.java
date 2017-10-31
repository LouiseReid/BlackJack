package com.example.louisereid.snap;

import java.util.ArrayList;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Snap {

    Player player;
    Dealer dealer;
    Deck deck;
    ArrayList<Card> pile;
    boolean isWon;

    public Snap(Player player, Dealer dealer, Deck deck){
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
        this.pile = new ArrayList<>();
        this.isWon = false;

    }

    public String start(){
        while(!deck.getCards().isEmpty()){
            player.takeCard(dealer.deal());
            dealer.takeCard(dealer.deal());
        }
        ArrayList<Player> players = new ArrayList<>();
        players.add(dealer);
        players.add(player);

        return takeTurns(players);
    }

    public String takeTurns(ArrayList<Player> players){
        while(!this.isWon && pile.size() < 52) {
            for (Player player : players) {
                pile.add(player.playCard());
                if (pile.size() > 2) {
                    if (checkWin()) {
                        return gameOver(player);
                    }
                }
            }
        }
        return "Nobody won, no cards left!";
    }

    public boolean checkWin(){
            if (pile.get(this.pile.size()-1).getValue() == pile.get(this.pile.size()-2).getValue()) {
                this.isWon = true;
                return true;
            }
        return false;
    }

    public String gameOver(Player player){
        return "SNAP! " + player.getName() + " has won";
    }
}
