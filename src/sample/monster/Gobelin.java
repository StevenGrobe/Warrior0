package sample.monster;

import sample.monster.Monster;

public class Gobelin extends Monster {
    public Gobelin () {
        setMobName("Goblin");
        setMobHp(6);
        setMobAtk(1);
        mobAttack();
    }

    @Override
    public void mobAttack() {
        System.out.println("use his claws");
    }
}
