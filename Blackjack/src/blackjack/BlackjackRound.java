/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author Kenneth
 */
public class BlackjackRound {
    private Deck theDeck;
    private HandOfCards playerHand;
    private HandOfCards dealerHand;
    private Scanner userInput;
    
    //Just create new instances of the class
    public BlackjackRound(){
        theDeck = new Deck();
        playerHand = new HandOfCards();
        dealerHand = new HandOfCards();
        userInput = new Scanner(System.in);
    }
    
    public boolean play(int bet){
        dealCardPhase();
        gameplayPhase();
        dealerBehavior();
        return checkWinCondition();
    }
    
    private void playerStay(){
        
    }
    
    private void playerHit(){
        Card drawnCard = theDeck.drawCard();
        System.out.println("The dealer deals you: " + drawnCard.returnCard());
        playerHand.addCard(drawnCard);
        playerOutput();
    }
    
    private void dealerBehavior(){
        if(playerHand.returnScore() > 21){
            System.out.println("You busted with a score of " + playerHand.returnScore());
            return;
        }else{
            System.out.println("The dealer reveals the face-down card which was: " + dealerHand.myHand.get(0).returnCard());
            System.out.println("The dealer's other card is " + dealerHand.myHand.get(1).returnCard());
            while(dealerHand.returnScore() < 17){
                System.out.println("The dealer gets another card.");
                Card dealerCard = theDeck.drawCard();
                System.out.println("The dealer drew " + dealerCard.returnCard());
                dealerHand.addCard(dealerCard);
            }
        }
    }

    
    private void dealCardPhase(){
        System.out.println("The dealer shuffles the deck");
        System.out.println("The dealer deals himself two cards.");
        dealerHand.addCard(theDeck.drawCard());
        dealerHand.addCard(theDeck.drawCard());
        dealerOutput();
        System.out.println("The dealer deals you two cards");
        playerHand.addCard(theDeck.drawCard());
        playerHand.addCard(theDeck.drawCard());
        playerOutput();
    }
    
    private void gameplayPhase(){
        boolean exitCondition = false;
        while(exitCondition == false)
        {
            System.out.println("Would you like to HIT or STAY?");
            System.out.println("Enter 'h' to HIT and get another card or enter 's' to STAY and stop drawing cards.");
            String userChoice = userInput.next();
            if(userChoice.equalsIgnoreCase("h"))
            {
                    playerHit();
                    if(playerHand.returnScore() > 21){
                        exitCondition = true;
                    }
            }
            else if(userChoice.equalsIgnoreCase("s"))
            {
                    playerStay();
                    exitCondition = true;
            }
            else
            {
                    System.out.println("Invalid entry.  Please try again.");
            }
        }
    }
    
    private void dealerOutput(){
        System.out.println("The Dealer has one card facedown.");
        for(int i = 1; i < dealerHand.myHand.size(); i++){
            System.out.println("The dealer also has: " + dealerHand.myHand.get(i).returnCard());
        }
    }
    
    private void playerOutput(){
        System.out.println("Your facedown card is: " + playerHand.myHand.get(0).returnCard());
        for(int i = 1; i < playerHand.myHand.size(); i++){
            System.out.println("You also have: " + playerHand.myHand.get(i).returnCard());
        }
        System.out.println("Your total score right now is: " + playerHand.returnScore());
    }
    
    private boolean checkWinCondition(){
        
        //player bust
        if(playerHand.returnScore() > 21){
            System.out.println("You busted with a score of " + playerHand.returnScore());
            return false;
        //dealer bust
        }else if(dealerHand.returnScore() > 21){
            System.out.println("The dealer busted with a score of " + dealerHand.returnScore());
            return true;
        //tie
        }else if(playerHand.returnScore() == dealerHand.returnScore()){
            System.out.println("Both the dealer and you have a score of " + playerHand.returnScore());
            System.out.println("Ties go to the house");
            return false;
        //player victory
        }else if(playerHand.returnScore() > dealerHand.returnScore()){
            System.out.println("Your score was " + playerHand.returnScore() + " while the dealer's score was only " + dealerHand.returnScore() + " which means you win!");
            return true;
        //dealer victor
        }else if(playerHand.returnScore() < dealerHand.returnScore()){
            System.out.println("Your score was " + playerHand.returnScore() + " but the dealer's score was " + dealerHand.returnScore() + " which means you lose.");
            return false;
        //If it gets here this is a bug
        }else{
            System.out.print("This is a bug.  If you got this you broke my program.  You are a dick.  You automatically lose.");
            return false;
        }
    }
    
}
