import java.util.*;

/** Subject (observable) - push data-flow strategy. */
public class Deck {
    private final List<Card> aCards = new ArrayList<>();
    private final List<DeckObserver> aObservers = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                aCards.add(new Card(rank, suit));
        Collections.shuffle(aCards);
    }

    public void addObserver(DeckObserver pObserver)    { aObservers.add(pObserver); }
    public void removeObserver(DeckObserver pObserver) { aObservers.remove(pObserver); }

    public Card draw() {
        Card card = aCards.remove(aCards.size() - 1);
        for (DeckObserver o : aObservers) o.cardDrawn(card);
        for (DeckObserver o : aObservers) o.sizeChanged(aCards.size());
        return card;
    }

    public int size() { return aCards.size(); }
}
