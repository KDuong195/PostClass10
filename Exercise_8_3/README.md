# Exercise 8.3 - Observer code in a SUBCLASS of Deck
Compile: `javac -d out src/*.java`   Run: `java -cp out Client`
Advantages: Deck unchanged (Open/Closed); old clients unaffected; separation of concerns; little code.
Disadvantages: must instantiate ObservableDeck from the start (cannot make an existing Deck observable);
fragile base class / must override every state-changing method; single inheritance blocks other extensions;
impossible if Deck or draw() is final.
