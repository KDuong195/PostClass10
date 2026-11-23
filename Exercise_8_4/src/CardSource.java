/** Common interface shared by Deck and its decorator(s). */
public interface CardSource {
    Card draw();
    int size();
}
