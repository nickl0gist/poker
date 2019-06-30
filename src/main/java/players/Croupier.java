package players;

import cards.Deck;
import cards.StandardDeck;

import java.util.Set;

public interface Croupier extends Player{

     void mixDeck();
     void giveCards();

     StandardDeck getDeck();
}
