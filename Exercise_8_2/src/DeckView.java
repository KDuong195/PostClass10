/** Read-only view of a deck (Interface Segregation): observers cannot mutate the Deck. */
public interface DeckView {
    int size();
    Card lastDrawn();
}
