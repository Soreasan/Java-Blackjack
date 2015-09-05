package blackjack;

public class Card {
    public  enum suit{
        HEARTS, SPADES, CLUBS, DIAMONDS, SUITERROR
    }
    public enum rank{
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, RANKERROR
    }
    private boolean taken;
    private suit mySuit;
    private rank myRank;
    
    public Card(suit theSuit, rank theRank){
        taken = false;
        mySuit = theSuit;
        myRank = theRank;
    }
    
    //This method returns the suit of the card as a string.  
    //So if the card is HEARTS when you use this method it will return "HEARTS"
    public String returnSuit(){
        return this.mySuit.toString();
    }
    
    //This method returns the "rank" (number or face value) of the card as a string
    //So if the card is TWO then the method will return a String that says "TWO"
    //If the card is a King it will return a string that says "KING"
    public String returnRank(){
        return this.myRank.toString();
    }
    
    public void cardIsTaken(){
        this.taken = true;
    }
    
    public boolean returnTaken(){
        return this.taken;
    }
    
    //let's player see the card
    public void displayCard(){
        System.out.println(mySuit + " " + myRank);
    }
    
    public String returnCard(){
        return (myRank.toString() + " of " + mySuit.toString());
    }
    
    //Returns an integer with the value
    public int returnBlackjackValue(){
        if (this.myRank == rank.TWO){
            return 2;
        }else if(this.myRank == rank.THREE){
            return 3;
        }else if(this.myRank == rank.FOUR){
            return 4;
        }else if(this.myRank == rank.FIVE){
            return 5;
        }else if(this.myRank == rank.SIX){
            return 6;
        }else if(this.myRank == rank.SEVEN){
            return 7;
        }else if(this.myRank == rank.EIGHT){
            return 8;
        }else if(this.myRank == rank.NINE){
            return 9;
        }else if(this.myRank == rank.TEN){
            return 10;
        }else if(this.myRank == rank.JACK){
            return 10;
        }else if(this.myRank == rank.QUEEN){
            return 10;
        }else if(this.myRank == rank.KING){
            return 10;
        }else if(this.myRank == rank.ACE){
            return 11;
        }else{
            System.out.println("Error, couldn't find card value");
            return 0;
        }
    }
}
