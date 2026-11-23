public class SizeStatus implements DeckObserver {
    @Override public void deckChanged(DeckView pDeck) {
        System.out.println("Deck size is now: " + pDeck.size());
    }
}
