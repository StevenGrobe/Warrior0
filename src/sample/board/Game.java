package sample.board;
import sample.monster.Dragon;
import sample.monster.Gobelin;
import sample.monster.Monster;
import sample.monster.Warlock;
import sample.player.Player;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    /**
     * Attributs :
     * boardList qui est notre plateau
     * Dude qui se réfère à notre personnage
     */
    private ArrayList<Case> boardList;
    private Player dude;

    /**
     * Constructeur de game qui nous permet de lancer un nouveau jeu :
     * On met la position du joueur dude à 1
     * On crée un Arraylist que l'on remplit
     * @see Game#fillBoard()
     * @param dude - On retrouve en parametre dude qui est notre personnage instancié
     */
    public Game(Player dude) {
        boardList = new ArrayList<>();
        dude.setPosition(1);
        this.dude = dude;
        fillBoard();
    }

    /**
     * On remplit notre Arraylist boardList avec des monstres, des cases vides et une case de départ.
     * @see sample.monster
     * @see sample.board.EmptyCase
     */
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
        for (int i = 0; i < 4; i++) {
            boardList.add(new Dragon());
        }
        Collections.shuffle(boardList);
        boardList.set(1, new WelcomeCase());
        System.out.println(boardList.get(dude.getPosition()));

    }

    /**
     * Lance un nouveau tour du joueur dude et vérifie le plateau
    * @see Game#checkBoard()
     */
    public void newTurn () {
        Turn turn = new Turn(dude);
        checkBoard();
    }

    /**
     * Vérifie que le joueur respecte la taille du plateau
     * @throws IndexOutOfBoundsException si il sort du plateau.
     */
    public void checkBoard() {
        int max = 64;
        try {
            System.out.println(boardList.get(dude.getPosition()));
            boardList.get(dude.getPosition()).interact(dude);
            for (int i = 0; i < max; i++) {
                if (boardList.size()>max)
                    throw new IndexOutOfBoundsException();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("End of the Dungeon");

        }
    }

    /**
     * Methode setter de notre plateau
     * @return notre plateau Boardlist
     */
    public ArrayList<Case> getBoard() {
        return boardList;
    }

    /**
     * Methode getter de notre plateau Boardlist
     * @param boardList - retourne le plateau
     */
    public void setBoard(ArrayList<Case> boardList) {
        this.boardList = boardList;
    }
}

