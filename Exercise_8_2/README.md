# Exercise 8.2 - Observer (pull) + Interface Segregation
Compile: `javac -d out src/*.java`   Run: `java -cp out Client`
- Observers receive `DeckView` (size(), lastDrawn()) and PULL what they need.
- DeckView has no draw(), so observers cannot change the Deck's state (checked at compile time).
