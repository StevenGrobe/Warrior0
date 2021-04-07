package sample.gear;

import sample.player.Player;

public abstract class Weapon extends Player {
    private int wepAtk;
    private String wepName;

    public int getWepAtk() {
        return wepAtk;
    }

    public void setWepAtk(int wepAtk) {
        this.wepAtk = wepAtk;
    }

    public String getWepName() {
        return wepName;
    }

    public void setWepName(String wepName) {
        this.wepName = wepName;
    }

}
