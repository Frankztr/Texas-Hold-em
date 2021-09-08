package Server.GameModule;

import Constants.Hand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MiniDeck extends Deck{
    protected Deck deck;

    MiniDeck(Deck deck,int number){
        this.deck=deck;
        for (int i = 0; i < number; i++) {
        this.deck.cardSet.add(this.deck.pickCard());
        cardNumber=number;
        }
    }

    protected void sort(){

    }

    public Hand toHand(){
        Iterator<Card> it=cardSet.iterator();
        ArrayList<Card> arrayList=new ArrayList<>();
        while(it.hasNext()) arrayList.add(it.next());
        Collections.sort(arrayList);
        it= arrayList.iterator();
        boolean sameSuit=true;
        for(int i=0;i<arrayList.size()-1;i++){
            if(arrayList.get(i).getSuit()!=arrayList.get(i+1).getSuit()){
                sameSuit=false;
            }
        }
        if(sameSuit){
            arrayList
        }



    }






}
