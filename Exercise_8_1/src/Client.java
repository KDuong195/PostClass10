public class Client {
    public static void main(String[] args) {
        Deck deck = new Deck();
        DrawLogger logger = new DrawLogger();
        deck.addObserver(logger);
        deck.addObserver(new SizeStatus());
        deck.draw();
        deck.draw();
        System.out.println("-- removing DrawLogger --");
        deck.removeObserver(logger);
        deck.draw();
    }
}
