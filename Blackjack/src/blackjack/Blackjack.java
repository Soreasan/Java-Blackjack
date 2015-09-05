package blackjack;

import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        boolean exitCondition = false;
        int wallet = 1000;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Blackjack!");
        while(exitCondition == false){
            System.out.println("You currently have $" + wallet + " in your wallet.");
            System.out.println("How much would you like to bet in this round of Blackjack?");
            while(!in.hasNextInt()){
                System.out.println("Try again");
                in.next();
            }
            int bet = in.nextInt();
            BlackjackRound newRound = new BlackjackRound();
            boolean betResult = newRound.play(bet);
            if(betResult == true){
                System.out.println("You won $" + bet);
                wallet += bet;
            }else{
                System.out.println("You lost $" + bet);
                wallet -= bet;
            }
            System.out.println("You now have $" + wallet);
            System.out.println("Would you like to play another game of Blackjack?");
            System.out.println("('y' for yes, 'n' for no)");
            String userInput = in.next();
            if(userInput.equalsIgnoreCase("y")){
                //Do nothing and continue player
            }else{
                exitCondition = true;
            }
        }
        System.out.println("You finished with $" + wallet);
        System.out.println("Thank you for playing Blackjack!");
    }
                
}
