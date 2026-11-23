# Exercise 8.4 - Observer code in a DECORATOR of Deck
Compile: `javac -d out src/*.java`   Run: `java -cp out Client`
Advantages: composition over inheritance; can wrap any CardSource (even an existing deck) at runtime;
decorators can be stacked; Deck unchanged apart from implementing CardSource.
Disadvantages: needs an extracted interface (CardSource); delegation boilerplate for every method;
changes made directly on the wrapped Deck bypass the decorator (no notifications); decorator != original object (identity).
