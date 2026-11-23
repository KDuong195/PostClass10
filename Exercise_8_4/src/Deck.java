import java.util.*;

public class Deck implements CardSource {
    private final List<Card> aCards = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                aCards.add(new Card(rank, suit));
        Collections.shuffle(aCards);
    }

    @Override public Card draw() { return aCards.remove(aCards.size() - 1); }
    @Override public int size()  { return aCards.size(); }
}
