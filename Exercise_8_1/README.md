# Exercise 8.1 - Observer (push)
Compile: `javac -d out src/*.java`   Run: `java -cp out Client`
- Deck = subject; DeckObserver = observer interface (cardDrawn(Card), sizeChanged(int)) - data is PUSHED as parameters.
- DrawLogger prints each drawn card; SizeStatus prints the new deck size.
