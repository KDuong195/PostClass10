import java.util.*;

/** All observer-supporting code lives in a DECORATOR of Deck. */
public class ObservableDeck implements CardSource {
    private final CardSource aDeck;
    private final List<DeckObserver> aObservers = new ArrayList<>();

    public ObservableDeck(CardSource pDeck) { aDeck = pDeck; }

    public void addObserver(DeckObserver pObserver)    { aObservers.add(pObserver); }
    public void removeObserver(DeckObserver pObserver) { aObservers.remove(pObserver); }

    @Override
    public Card draw() {
        Card card = aDeck.draw();
        for (DeckObserver o : aObservers) o.cardDrawn(card);
        for (DeckObserver o : aObservers) o.sizeChanged(aDeck.size());
        return card;
    }

    @Override public int size() { return aDeck.size(); }
}
