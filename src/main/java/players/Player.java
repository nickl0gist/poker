package players;

import cards.CardTypes;
import cards.Cards;

import java.util.HashSet;
import java.util.Set;

public interface Player {

    Set<CardTypes> cardSet = new HashSet<>();
    void setCardSet(CardTypes card);
    Set<CardTypes> getCardSet();

}
