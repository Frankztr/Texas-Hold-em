package Server.GameModule;

import Constants.Messages;
import Constants.Suits;

public class Card implements Comparable<Card>{
    private Suits suit;
    private int value;

    protected Card(Suits suit, int value) {
        if (value < 1 || value > 13) {
            System.out.println(Messages.ERROR_OCCURRED);
            System.out.println(Messages.ERROR_DECLARE + Messages.ERROR_TYPE_INVALID_CARD_NUMBER);
            System.exit(0);
        }
        this.suit = suit;
        this.value = value;
    }


    private Suits getSuit() {
        return this.suit;
    }

    private int getValue() {
        return this.value;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.value, o.value);
    }

    protected void checkInfo(){
        System.out.println(this.suit.toString()+" "+this.value);
    }
}