package blackjack;
import blackjack.Card;
import blackjack.Card.rank;
import blackjack.Card.suit;
import java.util.Random;

public class Deck {
    private Card[] theDeck;
    private Random myRandom;
    
    //The constructor.  This is what our deck does when it is initially constructed.
    public Deck(){
        //Creates a random number generator for us to use later
        myRandom = new Random();
        
        //Creates the deck of cards
        hardCodeCards();
    }
    
    
    
    private void hardCodeCards(){
        //Create the deck with 52 spots
        theDeck = new Card[52];
        //SPADES
        theDeck[0] = new Card(suit.SPADES, rank.TWO);
        theDeck[1] = new Card(suit.SPADES, rank.THREE);
        theDeck[2] = new Card(suit.SPADES, rank.FOUR);
        theDeck[3] = new Card(suit.SPADES, rank.FIVE);
        theDeck[4] = new Card(suit.SPADES, rank.SIX);
        theDeck[5] = new Card(suit.SPADES, rank.SEVEN);
        theDeck[6] = new Card(suit.SPADES, rank.EIGHT);
        theDeck[7] = new Card(suit.SPADES, rank.NINE);
        theDeck[8] = new Card(suit.SPADES, rank.TEN);
        theDeck[9] = new Card(suit.SPADES, rank.JACK);
        theDeck[10] = new Card(suit.SPADES, rank.QUEEN);
        theDeck[11] = new Card(suit.SPADES, rank.KING);
        theDeck[12] = new Card(suit.SPADES, rank.ACE);
        
        //HEARTS
        theDeck[13] = new Card(suit.HEARTS, rank.TWO);
        theDeck[14] = new Card(suit.HEARTS, rank.THREE);
        theDeck[15] = new Card(suit.HEARTS, rank.FOUR);
        theDeck[16] = new Card(suit.HEARTS, rank.FIVE);
        theDeck[17] = new Card(suit.HEARTS, rank.SIX);
        theDeck[18] = new Card(suit.HEARTS, rank.SEVEN);
        theDeck[19] = new Card(suit.HEARTS, rank.EIGHT);
        theDeck[20] = new Card(suit.HEARTS, rank.NINE);
        theDeck[21] = new Card(suit.HEARTS, rank.TEN);
        theDeck[22] = new Card(suit.HEARTS, rank.JACK);
        theDeck[23] = new Card(suit.HEARTS, rank.QUEEN);
        theDeck[24] = new Card(suit.HEARTS, rank.KING);
        theDeck[25] = new Card(suit.HEARTS, rank.ACE);
        
        //CLUBS
        theDeck[26] = new Card(suit.CLUBS, rank.TWO);
        theDeck[27] = new Card(suit.CLUBS, rank.THREE);
        theDeck[28] = new Card(suit.CLUBS, rank.FOUR);
        theDeck[29] = new Card(suit.CLUBS, rank.FIVE);
        theDeck[30] = new Card(suit.CLUBS, rank.SIX);
        theDeck[31] = new Card(suit.CLUBS, rank.SEVEN);
        theDeck[32] = new Card(suit.CLUBS, rank.EIGHT);
        theDeck[33] = new Card(suit.CLUBS, rank.NINE);
        theDeck[34] = new Card(suit.CLUBS, rank.TEN);
        theDeck[35] = new Card(suit.CLUBS, rank.JACK);
        theDeck[36] = new Card(suit.CLUBS, rank.QUEEN);
        theDeck[37] = new Card(suit.CLUBS, rank.KING);
        theDeck[38] = new Card(suit.CLUBS, rank.ACE);
        
        //Diamonds
        theDeck[39] = new Card(suit.DIAMONDS, rank.TWO);
        theDeck[40] = new Card(suit.DIAMONDS, rank.THREE);
        theDeck[41] = new Card(suit.DIAMONDS, rank.FOUR);
        theDeck[42] = new Card(suit.DIAMONDS, rank.FIVE);
        theDeck[43] = new Card(suit.DIAMONDS, rank.SIX);
        theDeck[44] = new Card(suit.DIAMONDS, rank.SEVEN);
        theDeck[45] = new Card(suit.DIAMONDS, rank.EIGHT);
        theDeck[46] = new Card(suit.DIAMONDS, rank.NINE);
        theDeck[47] = new Card(suit.DIAMONDS, rank.TEN);
        theDeck[48] = new Card(suit.DIAMONDS, rank.JACK);
        theDeck[49] = new Card(suit.DIAMONDS, rank.QUEEN);
        theDeck[50] = new Card(suit.DIAMONDS, rank.KING);
        theDeck[51] = new Card(suit.DIAMONDS, rank.ACE);
        
    }
    
    //THIS METHOD DOES NOT WORK
    //This was my original attempt to automatically generate the deck
    //It didn't work so I went ahead and hard-coded it
    private void createCardsWithLoops(){
        //Updates the array to hold the 52 cards
        theDeck = new Card[52];
        myRandom = new Random();
        
        int cardCounter = 0;

        //First select the suit (Ace or Hearts, etc)
        for(int i = 0; i < 4; i++){
            Card tempCard = null;
            suit tempSuit = null;
            rank tempRank = null;
            
            //First select the suit
            if(i == 0){
                tempSuit = suit.CLUBS;
            }else if(i == 1){
                tempSuit = suit.HEARTS;
            }else if(i == 2){
                tempSuit = suit.DIAMONDS;
            }else if(i == 3){
                tempSuit = suit.SPADES;
            }else{
                tempSuit = suit.SUITERROR;
            }
            
            //Then select the number/rank
            for(int j = 2; j < 14; j++){
                if(j == 2){
                    tempRank = rank.TWO;
                }else if(j == 3)
                {
                    tempRank = rank.THREE;
                }else if(j == 4)
                {
                    tempRank = rank.FOUR;
                }else if(j == 5)
                {
                    tempRank = rank.FIVE;
                }else if(j == 6)
                {
                    tempRank = rank.SIX;
                }else if(j == 7)
                {
                    tempRank = rank.SEVEN;
                }else if(j == 8)
                {
                    tempRank = rank.EIGHT;
                }else if(j == 9)
                {
                    tempRank = rank.NINE;
                }else if(j == 10)
                {
                    tempRank = rank.TEN;
                }else if(j == 11)
                {
                    tempRank = rank.JACK;
                }else if(j == 12)
                {
                    tempRank = rank.QUEEN;
                }else if(j == 13)
                {
                    tempRank = rank.KING;
                }else if(j == 14)
                {
                    tempRank = rank.ACE;
                }else{
                    tempRank = rank.RANKERROR;
                }
               tempCard = new Card(tempSuit, tempRank);
               theDeck[cardCounter] = tempCard;
               cardCounter++;
               
            }
        }
    }
    
    public Card drawCard(){
        //Ensure the card hasn't already been taken:
        boolean gotACard = false;
        
        //randCard will store the random number in the deck we chose
        int randCard = 0;  
        
        //creates a random number
        randCard = myRandom.nextInt(theDeck.length - 0);
        
        //This checks to make sure we get a valid card
        while(gotACard == false){
        //generate random numbers
        randCard = myRandom.nextInt(theDeck.length);
        //Finds a valid card to draw
        //System.out.println("Rand card is " + randCard);
        
        if(theDeck[randCard].returnTaken() == false){
                //breaks the WHILE loop since we found a valid card
                gotACard = true;
                //updates the card so we don't pick it again
                theDeck[randCard].cardIsTaken();
           }
        
        /*else{
            if(randCard == 52){
                randCard = 1;
            }else{
                randCard++;
            }
        }
                */
                
        }
        return theDeck[randCard];
    }
    
    public void enumerate(){
        for(int i = 0; i < theDeck.length; i++){
            System.out.println(theDeck[i].returnSuit() + " " + theDeck[i].returnRank());
        }
    }
}
