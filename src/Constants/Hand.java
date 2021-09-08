package Constants;

import Server.GameModule.Card;

import java.util.Comparator;

public enum Hand implements Comparator<Hand> {
    Royal_Flush(1), Straight_FLush(2),Four_of_a_Kind(3),Full_House(4),Flush(5),Straight(6),Three_of_a_Kind(7),Two_Pair(8),Pair(9),High_Card(10);

    public int num;

    Hand(int i) {
        this.num=i;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public int compare(Hand o1, Hand o2) {
        return Integer.compare(o1.num,o2.num);
    }
}
