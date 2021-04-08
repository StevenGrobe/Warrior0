package sample.player;

import sample.player.Player;

public class Warrior extends Player {
    public Warrior() {
        setMinHp(5);
        setMaxHp(11);
        setMinAtk(5);
        setMaxAtk(11);
        setDudeAtk(randomAtk());
        setDudeHp(randomHp());
    }
}
