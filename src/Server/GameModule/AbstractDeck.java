package Server.GameModule;

import Constants.Messages;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class AbstractDeck {
    protected Set<Card> cardSet=new HashSet<>();
    protected int cardNumber;


    protected void checkInfo(){
        System.out.println("----------------------------------------");
        System.out.println("Deck "+cardSet.hashCode()+" Info:");
        Card[] tempArray=cardSet.toArray(new Card[cardSet.size()]);
        for(int i=0;i<tempArray.length;i++){
            tempArray[i].checkInfo();
        }
        System.out.println("----------------------------------------");
    }



    public int getCardNumber(){
        return cardNumber;
    }




}
