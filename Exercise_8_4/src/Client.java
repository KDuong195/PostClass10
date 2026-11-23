public class Client {
    public static void main(String[] args) {
        ObservableDeck deck = new ObservableDeck(new Deck());
        deck.addObserver(new DrawLogger());
        deck.addObserver(new SizeStatus());
        deck.draw();
        deck.draw();
    }
}
