/** Observer interface - pull strategy: observer receives a read-only view and pulls data. */
public interface DeckObserver {
    void deckChanged(DeckView pDeck);
}
