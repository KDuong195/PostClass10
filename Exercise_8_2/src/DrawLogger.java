public class DrawLogger implements DeckObserver {
    @Override public void deckChanged(DeckView pDeck) {
        System.out.println("Card drawn: " + pDeck.lastDrawn());
        // pDeck.draw();  // does NOT compile: DeckView has no draw()
    }
}
