package Server.GameModule;

import Constants.Hand;
import Constants.Messages;

import java.util.*;

public class MiniDeck extends AbstractDeck {
    public MiniDeck(int number,Deck deck) {
        for (int i = 0; i < number; i++) {
            cardSet.add(deck.pickCard());
            cardNumber = number;
        }
    }



    public Hand toHand(){
        if(cardNumber != 5){
            System.out.println(Messages.ERROR_OCCURRED);
            System.out.println(Messages.ERROR_DECLARE+Messages.ERROR_TYPE_INVALID_NUMBERS_OF_CARD);
            System.exit(0);
        }
        boolean canFlush=true;
        Card[] cardList=cardSet.toArray(new Card[cardNumber]);
        for(int i=0;i<4;i++){
            if(cardList[i].getSuit()==cardList[i+1].getSuit()) canFlush=false;
        }
        Arrays.sort(cardList);
        boolean inSequence=true;
        for(int i=0;i<4;i++){
            if(cardList[i].getValue()+1!=cardList[i+1].getValue()){
                inSequence=false;
            }
        }
        



    }


}
