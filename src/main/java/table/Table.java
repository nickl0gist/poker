package table;

import players.CroupierTexas;
import players.RegularPlayer;

import java.util.Set;

public class Table {

    private Set<RegularPlayer> players;
    private CroupierTexas croupier;

    public Table(Set<RegularPlayer> players) {
        this.players = players;
    }

    public Set<RegularPlayer> getPlayers() {
        return players;
    }

    public void addPlayers(RegularPlayer player) {
        this.players.add(player);
    }
}
