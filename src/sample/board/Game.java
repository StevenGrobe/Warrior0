package sample.board;
import sample.monster.Dragon;
import sample.monster.Gobelin;
import sample.monster.Monster;
import sample.monster.Warlock;
import sample.player.Player;

import java.util.ArrayList;

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
        boardList.add(new EmptyCase());
        boardList.add(new WelcomeCase());
          for(int i = 0; i < 7; i++) {
              boardList.add(new Gobelin());
              boardList.add(new Gobelin());
              boardList.add(new EmptyCase());
              boardList.add(new Warlock());
              boardList.add(new EmptyCase());
              boardList.add(new Gobelin());
              boardList.add(new Warlock());
              boardList.add(new EmptyCase());
              boardList.add(new Dragon());
          }
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

