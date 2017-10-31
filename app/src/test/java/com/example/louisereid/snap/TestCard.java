package com.example.louisereid.snap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class TestCard {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.CLUBS, Rank.FOUR);
    }

    @Test
    public void hasValue(){
        assertEquals(4, card.getValue());
    }

    @Test
    public void getPrettyName(){
        assertEquals("Four of CLUBS", card.getprettyname());
    }

    @Test
    public void setAceValue(){
        card = new Card(Suit.CLUBS, Rank.ACE);
        card.rank.setAceValue(1);
        assertEquals(1, card.getValue());

    }
}
