package sample.board;
import sample.monster.Dragon;
import sample.monster.Gobelin;
import sample.monster.Monster;
import sample.monster.Warlock;
import sample.player.Player;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private ArrayList<Case> boardList;
    private Player dude;
    private Monster mob;

    public Game(Player dude) {
        boardList = new ArrayList<>();
        dude.setPosition(1);
        this.dude = dude;
        fillBoard();
    }

    public void fillBoard() {
        for (int i = 0; i < 30; i++) {
            boardList.add(new Gobelin());
        }

        for (int i = 0; i < 20; i++) {
            boardList.add(new Warlock());
        }

        for (int i = 0; i < 10; i++) {
            boardList.add(new EmptyCase());
        }
        for (int i = 0; i < 5; i++) {
            boardList.add(new Dragon());
        }
        Collections.shuffle(boardList);
        boardList.set(1, new WelcomeCase());
        System.out.println(boardList.get(dude.getPosition()));
    }

    public void newTurn () {
        Turn turn = new Turn(dude);
        System.out.println(boardList.get(dude.getPosition()));
        boardList.get(dude.getPosition()).interact(dude);
    }

    public ArrayList<Case> getBoard() {
        return boardList;
    }

    public void setBoard(ArrayList<Case> boardList) {
        this.boardList = boardList;
    }
}

