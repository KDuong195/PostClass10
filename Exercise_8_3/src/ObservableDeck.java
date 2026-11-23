import java.util.*;

/** All observer-supporting code lives in a SUBCLASS of Deck. */
public class ObservableDeck extends Deck {
    private final List<DeckObserver> aObservers = new ArrayList<>();

    public void addObserver(DeckObserver pObserver)    { aObservers.add(pObserver); }
    public void removeObserver(DeckObserver pObserver) { aObservers.remove(pObserver); }

    @Override
    public Card draw() {
        Card card = super.draw();
        for (DeckObserver o : aObservers) o.cardDrawn(card);
        for (DeckObserver o : aObservers) o.sizeChanged(size());
        return card;
    }
}
