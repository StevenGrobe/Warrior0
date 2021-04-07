package sample.gear.heal;

import sample.player.Player;

public abstract class Healing extends Player {
    private int potionStat;
    private String potionName;

    public int getPotionStat() {
        return potionStat;
    }

    public void setPotionStat(int potionStat) {
        this.potionStat = potionStat;
    }

    public String getPotionName() {
        return potionName;
    }

    public void setPotionName(String potionName) {
        this.potionName = potionName;
    }
}
