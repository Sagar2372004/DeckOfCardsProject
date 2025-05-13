public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Deck size: " + deck.getRemainingSize());
        deck.shuffle();
        var drawn = deck.drawCards(5);
        System.out.println("Drew " + drawn.size() + " cards.");
        System.out.println("Deck size now: " + deck.getRemainingSize());
    }
}
