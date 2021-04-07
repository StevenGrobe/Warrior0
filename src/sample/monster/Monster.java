package sample.monster;

import sample.board.Case;
import sample.player.Player;

public class Monster extends Case {
    private String mobName;
    private int mobHp;
    private int mobAtk;

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public String getMobName() {
        return mobName;
    }

    public void setMobAtk(int mobAtk) {
        this.mobAtk = mobAtk;
    }

    public int getMobAtk() {
        return mobAtk;
    }

    public void setMobHp(int mobHp) {
        this.mobHp = mobHp;
    }

    public int getMobHp() {
        return mobHp;
    }

    @Override
    public String toString() {
        return  " *-----------------------------------------------*" +
                "\n" + "           " + "What..? A" + " " + mobName + " " + "appeared!" +
                "\n" + "               " + "What should i do?" +
               "\n" + "*-----------------------------------------------*";
    }

    @Override
    public void interact (Player dude){
        while (getMobHp() > 0 && dude.getDudeHp() > 0) {
            setMobHp(getMobHp() - dude.getDudeAtk());
            System.out.println("You deal " + dude.getDudeAtk() + " dmg to " + getMobName());

            if (getMobHp() > 0) {
                dude.setDudeHp(dude.getDudeHp() - getMobAtk());
                System.out.println("You lost " + getMobAtk() + " hp to " + getMobName() +
                        "\n" + dude.getName() + " = " + dude.getDudeHp());
                System.out.println(getMobName() + " = " + getMobHp());
            } else {
                System.out.println("you slayed the " + getMobName());
            }

        }
    }
}

