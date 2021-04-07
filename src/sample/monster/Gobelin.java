package sample.monster;

import sample.monster.Monster;

public class Gobelin extends Monster {
    public Gobelin () {
        setMobName("Goblin");
        setMobHp(6);
        setMobAtk(1);
    }

    public void mobAttack() {
        System.out.println(getMobName() + " use his claws");
    }
}
