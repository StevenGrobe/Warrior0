package sample.monster;

import sample.monster.Monster;

public class Dragon extends Monster {
    public Dragon () {
        setMobName("Dragon");
        setMobHp(15);
        setMobAtk(4);

    }
    public void mobAttack() {
        System.out.println(getMobName() + " throw fire");
    }
}
