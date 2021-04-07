package sample.board;

import sample.player.Player;

public abstract class Case {
    private String name;

    public Case(String name) {
        this.name = name;
    }

    public Case() {
    }

    @Override
    public String toString() {
        return name;
    }

    public void interact (Player dude){

    }
}
