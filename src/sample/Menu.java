package sample;

import sample.board.Game;
import sample.player.Mage;
import sample.player.Player;
import sample.player.Warrior;

import java.util.Scanner;

public class Menu {

    private String displayDudeName;
    private String displayJob;
    private Player dude;

    public void category() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" *-----------------------------------------------*" +
                "\n" + "   " + "1- Create || 2- Display || 3- Play || 4- Quit" +
                "\n *-----------------------------------------------*");
        System.out.print("Your choice? = ");
        String user = scanner.nextLine();
        switch (user) {
            case "1":
                createDude();
                break;
            case "2":
                displayDude();
                break;
            case "3":
                if (displayJob != null) {
                    Game game = new Game(dude);
                    while (dude.getPosition() < 64) {
                        System.out.print("new turn? y/n = ");
                        user = scanner.nextLine();
                        if (user.equals("y")) {
                            game.newTurn();
                        }
                    }
                } else {
                    System.out.println("** Please create caracter **");
                }
                break;
            case "4":
                System.out.println("Goodbye");
                System.exit(0);
        }
    }

    public void createDude() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("War || Mage? w/m = ");
        String user = scanner.nextLine();
        if (user.equals("w") || (user.equals("m"))) {
            if (user.equals("w")) {
                this.dude = createWarDude();
            } else {
                this.dude = createMageDude();
            }
            System.out.print(displayJob + " name? = ");
            String name = scanner.nextLine();
            dude.setName(name);
            displayDudeName = dude.getName();
            displayDude();
        } else {
            System.out.println("** Wrong input **");
        }
        category();
    }

    public Player createWarDude() {
        displayJob = "warrior";
        Player dude = new Warrior();
        return dude;
    }

    public Player createMageDude() {
        displayJob = "mage";
        Player dude = new Mage();
        return dude;
    }

    public void displayDude() {
        if (displayJob == null) {
            System.out.println("** Please create caracter **");
        } else {
            System.out.println("Job :" + " " + displayJob);
            System.out.println("Name :" + " " + displayDudeName);
            System.out.println("Hp :" + " " + dude.getDudeHp());
            System.out.println("Atk :" + " " + dude.getDudeAtk());
        }
        category();
    }
}
