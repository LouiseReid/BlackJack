package com.example.louisereid.snap;

import java.util.ArrayList;
import java.util.Scanner;

import static android.R.attr.id;
import static android.R.attr.y;

/**
 * Created by louisereid on 31/10/2017.
 */

public class BlackJackGame {


    Player player;
    Dealer dealer;
    Deck deck;
    Card card;


    public BlackJackGame(Player player, Dealer dealer, Deck deck) {
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;


    }

    public String start() {
            player.takeCard(dealer.deal());
            dealer.takeCard(dealer.deal());
            player.takeCard(dealer.deal());
            dealer.takeCard(dealer.deal());

            player.getHandValue();
            dealer.getHandValue();

        System.out.println("Your cards are " + player.getHandContents());
        acesCheck();

        System.out.println("The dealer's face card is " + dealer.getCards().get(0).getprettyname());
        System.out.println("Do you want another card?");
        Scanner scanner = new Scanner(System.in);
        String playerChoice = scanner.nextLine();

        while (playerChoice.equals("y")) {
            player.takeCard(dealer.deal());
            player.getHandValue();
            System.out.println("Your cards are " + player.getHandContents());
            if(player.playerHandValue >= 21) {
                break;
            }

            System.out.println("Do you want another card?");
            playerChoice = scanner.nextLine();
            System.out.println(playerChoice);


            }

        System.out.println("Dealer's cards are " + dealer.getHandContents());
        System.out.println("Your total is " + player.getHandValue());
        System.out.println("The dealer's total is " + dealer.getHandValue());

        return compareHands();
        }




    public String compareHands() {
        if (player.playerHandValue > 21) {
            System.out.println("BUST!");
        }
        if (dealer.playerHandValue > 21){
            System.out.println("Dealer is BUST!");
        }
        if (player.playerHandValue > dealer.playerHandValue && player.playerHandValue < 22) {
            System.out.println("Player wins!");
        }
        if (player.playerHandValue == dealer.playerHandValue) {
            System.out.println("Draw");
        }
        if (player.playerHandValue < dealer.playerHandValue)
        {System.out.println("Dealer wins");
        }
        return "GAME OVER";
    }

        public void acesCheck() {
            if (player.aceCheck() == true) {
                System.out.println("Do you want to play aces high(h) or low(l)?");
//            player input
                Scanner scanner2 = new Scanner(System.in);
                String highlow = scanner2.nextLine();
                if (highlow.equals("l")) {
                    player.playerHandValue -= 10;
                }
            }
            if (player.aceCheck() == false) {
            }
        }

        public void playAgain(){
            System.out.println("Do you want to play again?");
            Scanner scanner = new Scanner(System.in);
            String playerResponce = scanner.nextLine();
            if(playerResponce.equals("y")){
                player.getCards().clear();
                dealer.getCards().clear();
                start();
            }
        }
}
