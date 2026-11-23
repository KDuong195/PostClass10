import java.util.*;

/** Subject - pull data-flow strategy. */
public class Deck implements DeckView {
    private final List<Card> aCards = new ArrayList<>();
    private final List<DeckObserver> aObservers = new ArrayList<>();
    private Card aLastDrawn;

    public Deck() {
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                aCards.add(new Card(rank, suit));
        Collections.shuffle(aCards);
    }

    public void addObserver(DeckObserver pObserver)    { aObservers.add(pObserver); }
    public void removeObserver(DeckObserver pObserver) { aObservers.remove(pObserver); }

    public Card draw() {
        aLastDrawn = aCards.remove(aCards.size() - 1);
        for (DeckObserver o : aObservers) o.deckChanged(this); // exposed only as DeckView
        return aLastDrawn;
    }

    @Override public int size()       { return aCards.size(); }
    @Override public Card lastDrawn() { return aLastDrawn; }
}
