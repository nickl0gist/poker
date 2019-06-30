package table;

import players.RegularPlayer;
import players.Сroupier;

import java.util.Set;

public class Table {

    private Set<RegularPlayer> players;
    private Сroupier croupier;

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
