package Constants;

import Server.GameModule.Card;

import java.util.Comparator;

public class FormedHand implements Comparator<FormedHand> {
    public Hand hand;
    public int val;


    FormedHand(Hand i,int val) {
        this.hand=i;
        this.val=val;
    }


    @Override
    public String toString() {
        return Hand.toString();
    }


    @Override
    public int compare(Hand o1, Hand o2) {
        return Integer.compare(o1.num,o2.num);
    }
}
