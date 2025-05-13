import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        List<Card> drawnCards = deck.drawCards(20);
        System.out.println("Drawn Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }

        drawnCards.sort(new CardComparator());
        System.out.println("\nSorted Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }

        System.out.println("\nRemaining cards in deck: " + deck.getRemainingSize());
    }
}
