package Server.GameModule;

import Constants.Suits;

import java.util.HashSet;
import java.util.Set;

public class Deck {
    private Set<Card> cardSet=new HashSet<>();

    public Deck(){
        for(int i=1;i<14;i++){
            cardSet.add(new Card(Suits.Clovers,i));
            cardSet.add(new Card(Suits.Hearts,i));
            cardSet.add(new Card(Suits.Pikes,i));
            cardSet.add(new Card(Suits.Tiles,i));
        }
    }

    public void checkInfo(){
        Card[] tempArray=cardSet.toArray(new Card[cardSet.size()]);
        for(int i=0;i<tempArray.length;i++){
            tempArray[i].checkInfo();
        }
    }


}
