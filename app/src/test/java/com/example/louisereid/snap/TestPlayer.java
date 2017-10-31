package com.example.louisereid.snap;

import org.junit.Before;
import org.junit.Test;

import static com.example.louisereid.snap.Rank.ACE;
import static com.example.louisereid.snap.Rank.FIVE;
import static com.example.louisereid.snap.Rank.FOUR;
import static com.example.louisereid.snap.Suit.CLUBS;
import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class TestPlayer {

    Player player;
    Card card;
    Card card2;


    @Before
    public void setUp() {
        player = new Player("Louise");
        card = new Card(CLUBS, FIVE);
        card2 = new Card(CLUBS, ACE);

    }

    @Test
    public void canTakeCard(){
        player.takeCard(card);
        assertEquals(1, player.getCards().size());
    }

    @Test
    public void canPlayCard(){
        player.takeCard(card);
        Card card = player.playCard();
        assertEquals(Suit.CLUBS, card.getSuit());
        assertEquals(Rank.FIVE, card.getRank());
    }

    @Test
    public void handContents(){
        player.takeCard(card);
        player.takeCard(card2);
        assertEquals("Five of CLUBS, Ace of CLUBS, ", player.getHandContents());
    }

    @Test
    public void acecheck(){
        player.takeCard(card2);
        assertEquals(true, player.aceCheck());
    }
}
