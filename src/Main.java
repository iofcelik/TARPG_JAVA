import java.io.IOException;

import systems.Attributes;
import systems.Enemy;
import systems.GameSystems;
import systems.Player;
import java.util.Scanner;
import java.util.HashMap;
//works now :D

public class Main {
    public static void main(String[] args) {
        GameSystems gs = new GameSystems();
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, systems.Item> plyrInventory = new HashMap<>();
        gs.initializeWeaponsList();
        gs.initializeArmorsList();
        gs.initializeTalismansList();
        gs.initializeMovesList();
        gs.initializeEnemiesList();
        gs.initializeConsumablesList();
        systems.Player plyr = new Player(Attributes.Title.NONE, Attributes.Color.NONE, 0, 6.0, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 1, 0, 100, 100, 10, 5, 7, 1, 5, 0, plyrInventory, gs.weaponsList.get(10), gs.armorsList.get(1), gs.talismansList.get(1));


        System.out.println("----------------------------WELCOME TO THE TEXT ADVENTURE ROLE PLAYING GAME (TARPG)!----------------------------\n");
        int menuOptionSelect = gs.gameStartMenu(plyr);
        while (menuOptionSelect != 4) {
            if (menuOptionSelect == 1) {
                try {
                    gs.fillPlayerStats(plyr);
                    //gs.beginNewGame(plyr);
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (menuOptionSelect == 2) {
                gs.continueGame();
            } else if (menuOptionSelect == 3) {
                boolean satisfied = false;
                int round = 0;
                while (!satisfied) {
                    gs.enemyEncounter(plyr, new Enemy("Goon", 3, 15, 200, 300, 40, 25, Attributes.SkillType.NONE, Attributes.ClassType.FIGHTER, gs.weaponsList.get(4)));
                    System.out.println("Continue through endless mode? Round#: " + round);
                    String input = scan.nextLine();
                    if (!(input.contains("YES") || input.contains("Yes") || input.contains("yes") || input.equals("Y") || input.equals("y"))) {
                        satisfied = true;
                    }
                    round++;
                }
            }
            menuOptionSelect = gs.gameStartMenu(plyr);
        }
        gs.exitGame();


        }
    }
