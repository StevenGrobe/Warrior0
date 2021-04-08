package sample.board;

import sample.board.Case;

public class Dice extends Case {
    private int diceMin = 1;
    private int diceMax = 7;

    public int getDiceMin() {
        return diceMin;
    }
    public int getDiceMax() {
        return diceMax;
    }
    public int throwDice() {
        return (int) Math.floor(Math.random() * (diceMax - diceMin) + diceMin);
    }

    public Dice () {

    }

}
