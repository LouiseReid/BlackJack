package com.example.louisereid.snap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class TestDeck {

    Deck deck;
    Deck spyDeck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
        spyDeck = Mockito.spy(deck);
    }

    @Test
    public void canGenerateDeck(){
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canGetCard(){
        Mockito.when(spyDeck.removeCard()).thenReturn(new Card(Suit.HEARTS, Rank.ACE));
        Card card = spyDeck.removeCard();
        assertEquals(Suit.HEARTS, card.getSuit());
        assertEquals(Rank.ACE, card.getRank());
    }
}
