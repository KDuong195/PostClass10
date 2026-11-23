/** Observer interface - push strategy: data is passed as parameters. */
public interface DeckObserver {
    default void cardDrawn(Card pCard) {}
    default void sizeChanged(int pSize) {}
}
