package com.example.louisereid.snap;

import java.util.ArrayList;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> cards;
    int playerHandValue;


    public Player(String name){
        this.name = name;
        this.cards = new ArrayList<>();
        this.playerHandValue = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void takeCard(Card card){
        this.cards.add(card);
    }

    public int getHandValue() {
        playerHandValue = 0;
        for (Card card : cards) {
            playerHandValue += card.getValue();
        }
        return playerHandValue;
    }

    public Card playCard(){
        return cards.remove(0);
    }

    public String getHandContents(){
        String hand = "";
        for(Card card : cards){
            hand += card.getprettyname() + ", ";
        }
        return hand;
    }

    public boolean aceCheck(){
        return getHandContents().contains("Ace");
    }


}
