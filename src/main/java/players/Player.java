package players;

import cards.CardTypes;

import java.util.HashSet;
import java.util.Set;

public interface Player {

    int points = 0;
    Set<CardTypes> cardSet = new HashSet<>();
    void setCardSet(CardTypes card);
    Set<CardTypes> getCardSet();

    void setPoints();
    int getPoints();
}
