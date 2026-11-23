import java.util.*;

/** Original Deck - knows nothing about observers. */
public class Deck {
    private final List<Card> aCards = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                aCards.add(new Card(rank, suit));
        Collections.shuffle(aCards);
    }

    public Card draw() { return aCards.remove(aCards.size() - 1); }
    public int size()  { return aCards.size(); }
}
