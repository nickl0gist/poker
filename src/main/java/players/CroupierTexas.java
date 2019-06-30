package players;
import cards.CardTypes;
import cards.StandardDeck;

import java.util.Set;

public class CroupierTexas implements Croupier {

    @Override
    public StandardDeck getDeck() {
        return null;
    }

    @Override
    public void mixDeck() {

    }

    @Override
    public void giveCards() {

    }

    @Override
    public void setCardSet(CardTypes card) {

    }

    @Override
    public Set<CardTypes> getCardSet() {
        return null;
    }

    @Override
    public void setPoints() {

    }

    @Override
    public int getPoints() {
        return 0;
    }
}
