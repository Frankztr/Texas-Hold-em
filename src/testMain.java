import Constants.Hand;
import Server.GameModule.*;

public class testMain {
    public static void main(String[] args){
        Deck deck=new Deck();
        MiniDeck miniDeck=new MiniDeck(5,deck);
        miniDeck.sort();
    }
}
