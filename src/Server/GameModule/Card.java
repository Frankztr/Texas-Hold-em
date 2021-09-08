package Server.GameModule;

import Constants.Messages;
import Constants.Suits;

public class Card implements Comparable<Card>{
    private Suits suit;
    private int value;

    //Creating Card
    protected Card(Suits suit, int value) {
        //Preventing possible error
        if (value < 1 || value > 13) {
            System.out.println(Messages.ERROR_OCCURRED);
            System.out.println(Messages.ERROR_DECLARE + Messages.ERROR_TYPE_INVALID_CARD_NUMBER);
            //Terminate the program
            System.exit(0);
        }
        this.suit = suit;
        this.value = value;
    }


    public Suits getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    //Accessing Comparable interface
    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.value, o.value);
    }

    //Print the Info of the card to terminal
    protected void checkInfo(){
        System.out.println(this.suit.toString()+" "+this.value);
    }
}