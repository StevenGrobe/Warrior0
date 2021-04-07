package sample.player;

import sample.player.Player;

public class Mage extends Player {
    public Mage() {
        super();
        setMinHp(3);
        setMaxHp(7);
        setMinAtk(8);
        setMaxAtk(15);
        setDudeHp(randomHp());
        setDudeAtk(randomAtk());
    }


}
