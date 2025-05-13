import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        int color1 = getColor(c1.getSuit());
        int color2 = getColor(c2.getSuit());

        if (color1 != color2) {
            return color1 - color2;
        }

        int suit1 = getSuitPriority(c1.getSuit());
        int suit2 = getSuitPriority(c2.getSuit());
        if (suit1 != suit2) {
            return suit1 - suit2;
        }

        return c1.getRank().ordinal() - c2.getRank().ordinal();
    }

    private int getColor(Suit suit) {
        return (suit == Suit.HEARTS || suit == Suit.DIAMONDS) ? 0 : 1;
    }

    private int getSuitPriority(Suit suit) {
        switch (suit) {
            case HEARTS: return 0;
            case DIAMONDS: return 1;
            case SPADES: return 2;
            case CLUBS: return 3;
        }
        return -1;
    }
}
