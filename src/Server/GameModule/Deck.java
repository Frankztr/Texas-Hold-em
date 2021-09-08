package Server.GameModule;

import Constants.Messages;
import Constants.Suits;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Deck {
    protected Set<Card> cardSet=new HashSet<>();
    protected int cardNumber=52;
    public Deck(){
        for(int i=1;i<14;i++){
            cardSet.add(new Card(Suits.Club,i));
            cardSet.add(new Card(Suits.Hearts,i));
            cardSet.add(new Card(Suits.Diamond,i));
            cardSet.add(new Card(Suits.Spade,i));
        }
    }


    protected void checkInfo(){
        System.out.println("----------------------------------------");
        System.out.println("Deck "+cardSet.hashCode()+" Info:");
        Card[] tempArray=cardSet.toArray(new Card[cardSet.size()]);
        for(int i=0;i<tempArray.length;i++){
            tempArray[i].checkInfo();
        }
        System.out.println("----------------------------------------");
    }

    //Randomly pick and remove one card from the deck
    protected Card pickCard(){
        Card[] tempArray=cardSet.toArray(new Card[cardSet.size()]);
        Random random=new Random();
        Card ans=tempArray[random.nextInt(cardNumber)];
        if(!cardSet.contains(ans)){
            System.out.println(Messages.ERROR_OCCURRED);
            System.out.println(Messages.ERROR_DECLARE+Messages.ERROR_TYPE_FAIL_TO_DELETE_CARD);
            System.exit(0);
        }
        cardSet.remove(ans);
        cardNumber--;
        return ans;
    }

    public int getCardNumber(){
        return cardNumber;
    }


}
