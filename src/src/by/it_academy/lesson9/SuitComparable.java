package by.it_academy.lesson9;

public class SuitComparable implements SuitComparablee {
    @Override
    public int compare(Card o1, Card o2){
        return o1.getSuit().compareTo(o2.getSuit());
    }


    public Comparable<Card> thenComparing(PriceComporator.PriceComparator priceComparator) {
        return null;
    }
}

