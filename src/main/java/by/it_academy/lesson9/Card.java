package by.it_academy.lesson9;

import java.util.ArrayList;

public class Card {
    private final int price;
    private final Suit suit;

    public Card(int price, Suit suit) {
        this.price = price;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return suit.toString() + " " + cardValue();
    }

    private String cardValue() {
        switch (getPrice()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "" + getPrice();
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            case 14:
                return "A";
            default:
                return null;
        }
    }


    public static void main(String[] args) {
        ArrayList<Card> cardSet = new ArrayList<>();
        cardSet.add(new Card(11, Suit.CLUB));
        cardSet.add(new Card(4, Suit.SPADE));
        cardSet.add(new Card(1, Suit.HEART));
        cardSet.add(new Card(13, Suit.DIAMOND));
        cardSet.add(new Card(4, Suit.HEART));
        cardSet.add(new Card(7, Suit.CLUB));
        for (Card card : cardSet) {
            System.out.println(card);
        }
    }


}


