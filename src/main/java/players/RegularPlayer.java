package players;
import cards.CardTypes;
import java.util.Set;

public class RegularPlayer implements Player {

    private boolean isDealer;

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

    public boolean isDealer(){
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }
}
