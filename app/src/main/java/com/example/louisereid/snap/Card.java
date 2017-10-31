package com.example.louisereid.snap;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Card {

    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue(){
        return rank.getValue();
    }

    public String getprettyname(){
        return rank.getName() + " of " + getSuit();
    }


}
