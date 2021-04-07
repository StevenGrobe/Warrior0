package sample.monster;

import sample.monster.Monster;

public class Warlock extends Monster {
    public Warlock () {
        setMobName("Warlock");
        setMobHp(9);
        setMobAtk(2);
    }

    public void mobAttack() {
        System.out.println(getMobName() + " use dark magic");
    }
}
