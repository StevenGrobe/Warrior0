package sample.board;

import sample.board.Case;
import sample.board.Dice;
import sample.monster.Gobelin;
import sample.monster.Monster;
import sample.player.Player;

public class Turn extends Case {
    private Dice dice = new Dice();


    public void walk(Player dude) {
        int diceResult = dice.throwDice();
        dude.setPosition(dude.getPosition() + diceResult);
        System.out.println("dice = " + diceResult);
        System.out.println("dude position = " + dude.getPosition());
    }

    public Turn (Player dude) {
        walk(dude);
    }
}
