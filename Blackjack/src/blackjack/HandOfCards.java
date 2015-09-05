
package blackjack;

import java.util.ArrayList;

public class HandOfCards {
    //Arraylists are arrays that can change size.  
    protected ArrayList<Card> myHand;
    
    //All the constructor does is initialize the array
    public HandOfCards(){
        myHand = new ArrayList<Card>();
    }
    
    //adds a new card to the hand
    public void addCard(Card addedCard){
        myHand.add(addedCard);
    }
    
    //returns the value of the player's hand
    public int returnScore(){
        int tempScore = 0;
        //counts the values of the cards in the player's hand.  
        for(int i = 0; i < myHand.size(); i++){
            tempScore += myHand.get(i).returnBlackjackValue();
        }
        
        //If their score is over 21 we check if there is an ace in their hand
        //if there is an ace we decrease their score by ten so they don't "bust" anymore.
        if(tempScore > 21){
            //Check every card in the deck
            for(int i = 0; i < myHand.size(); i++){
                //If there is an Ace in their hand decrease the score by 10.
                if(myHand.get(i).returnBlackjackValue() == 11){
                    tempScore -= 10;
                }
            }
        }
        //Return the score after counting all the cards and accounting for aces
        return tempScore;
    }
}