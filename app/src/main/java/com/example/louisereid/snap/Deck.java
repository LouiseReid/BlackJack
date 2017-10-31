package com.example.louisereid.snap;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Deck {

    ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        generateDeck();

    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void generateDeck(){
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                cards.add(new Card(suit, rank ));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card removeCard(){
        return this.cards.remove(0);
    }



}
