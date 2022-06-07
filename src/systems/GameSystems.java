package systems;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

import static systems.Attributes.MoveType.ATTACK;
import static systems.Attributes.SkillType.ELEMENTAL;
import static systems.Attributes.SkillType.NONE;

public class GameSystems {
    private Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    public HashMap<Integer, Item> weaponsList = new HashMap<>();
    public HashMap<Integer, Item> armorsList = new HashMap<>();
    public HashMap<Integer, Item> talismansList = new HashMap<>();
    public HashMap<Integer, Item> consumablesList = new HashMap<>();
    public HashMap<Integer, Move> movesList = new HashMap<>();
    public HashMap<Integer, Enemy> enemiesList = new HashMap<>();

    public void initializeMovesList() {
        Move none = new Move("", Attributes.MoveType.NONE, NONE, Attributes.ClassType.NONE);
        Move fireball = new Move("Fire Ball", ATTACK, ELEMENTAL, Attributes.ClassType.NONE);

        movesList.put(0, none);
        movesList.put(1, fireball);

    }
    public void initializeWeaponsList() {
        Item freeHand = new Item("Free Hand", Attributes.Color.NONE, Attributes.ItemType.NONE, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 0, 0, 0, 0, 0, 0, 0, movesList.get(0), 0);
        Item t1neutralWeapon = new Item("Wooden Plank", Attributes.Color.BROWN, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 50, 25, 0, 0, 0, 10, 0, movesList.get(0), 1);
        Item t2neutralWeapon = new Item("Steel Sword", Attributes.Color.GRAY, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 100, 50, 0, 0, 0, 20, 0, movesList.get(0), 2);
        Item t3neutralWeapon = new Item("Damascus Blade", Attributes.Color.BLUE, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 300, 75, 0, 1, 1, 30, 0, movesList.get(0), 3);
        Item t4fighterWeapon = new Item("Falchion", Attributes.Color.GRAY, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.FIGHTER, 350, 100, 0, 2, 2, 40, 0, movesList.get(0), 4);
        Item t5fighterWeapon = new Item("Excalibur", Attributes.Color.ORANGE, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.FIGHTER, 400, 125, 0, 3, 3, 50, 0, movesList.get(0), 5);
        Item t4tankWeapon = new Item("Steel Battle Axe", Attributes.Color.GRAY, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.TANK, 350, 100, 0, 2, 3, 40, 0, movesList.get(0), 4);
        Item t5tankWeapon = new Item("Glinting Greatsword", Attributes.Color.YELLOW, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.TANK, 400, 125, 0, 3, 3, 50, 0, movesList.get(0), 5);
        Item t4supportWeapon = new Item("Poison Bow & Arrow", Attributes.Color.BROWN, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.SUPPORT, 350, 100, 0, 2, 3, 40, 0, movesList.get(0), 4);
        Item t5supportWeapon = new Item("Obsidian Bracers", Attributes.Color.BLACK, Attributes.ItemType.WEAPON, Attributes.SkillType.NONE, Attributes.ClassType.SUPPORT, 400, 125, 0, 3, 3, 50, 0, movesList.get(0), 5);
        Item t6elementalFighterWeapon = new Item("Blade of Pyre", Attributes.Color.RED, Attributes.ItemType.WEAPON, ELEMENTAL, Attributes.ClassType.FIGHTER, 450, 150, 50, 3, 4, 60, 0, movesList.get(1), 6);
        Item t6superFighterWeapon = new Item("Zulfikar", Attributes.Color.GREEN, Attributes.ItemType.WEAPON, Attributes.SkillType.SUPER, Attributes.ClassType.FIGHTER, 450, 150, 50, 3, 4, 60, 0, movesList.get(0), 6);
        Item t6psychicFighterWeapon = new Item("Golden Essence", Attributes.Color.YELLOW, Attributes.ItemType.WEAPON, Attributes.SkillType.PSYCHIC, Attributes.ClassType.FIGHTER, 450, 150, 50, 3, 4, 60, 0, movesList.get(0), 6);
        Item t6elementalTankWeapon = new Item("Hammer of Gaia", Attributes.Color.BROWN, Attributes.ItemType.WEAPON, ELEMENTAL, Attributes.ClassType.TANK, 450, 150, 50, 3, 4, 60, 0, movesList.get(0), 6);
        Item t6superTankWeapon = new Item("Gauntlet of Fury", Attributes.Color.GREEN, Attributes.ItemType.WEAPON, Attributes.SkillType.SUPER, Attributes.ClassType.TANK, 450, 150, 50, 3, 4, 60, 0, movesList.get(0), 6);
        Item t6psychicTankWeapon = new Item("Dark Essence", Attributes.Color.BLACK, Attributes.ItemType.WEAPON, Attributes.SkillType.PSYCHIC, Attributes.ClassType.TANK, 450, 150, 50, 3, 4, 60, 0, movesList.get(0), 6);
        Item t6elementalSupportWeapon = new Item("Flowing Glaive", Attributes.Color.BLUE, Attributes.ItemType.WEAPON, ELEMENTAL, Attributes.ClassType.SUPPORT, 450, 150, 50, 3, 4, 60, 0, movesList.get(0), 6);
        Item t6superSupportWeapon = new Item("Ki", Attributes.Color.YELLOW, Attributes.ItemType.WEAPON, Attributes.SkillType.SUPER, Attributes.ClassType.SUPPORT, 450, 150, 50, 3, 4, 60, 0, movesList.get(0), 6);
        Item t6psychicSupportWeapon = new Item("Mighty Staff", Attributes.Color.BLACK, Attributes.ItemType.WEAPON, Attributes.SkillType.PSYCHIC, Attributes.ClassType.SUPPORT, 450, 150, 50, 3, 4, 60, 0, movesList.get(0), 6);
        weaponsList.put(0, freeHand);
        weaponsList.put(1, t1neutralWeapon);
        weaponsList.put(2, t2neutralWeapon);
        weaponsList.put(3, t3neutralWeapon);
        weaponsList.put(4, t4fighterWeapon);
        weaponsList.put(5, t5fighterWeapon);
        weaponsList.put(6, t4tankWeapon);
        weaponsList.put(7, t5tankWeapon);
        weaponsList.put(8, t4supportWeapon);
        weaponsList.put(9, t5supportWeapon);
        weaponsList.put(10, t6elementalFighterWeapon);
        weaponsList.put(11, t6superFighterWeapon);
        weaponsList.put(12, t6psychicFighterWeapon);
        weaponsList.put(13, t6elementalTankWeapon);
        weaponsList.put(14, t6superTankWeapon);
        weaponsList.put(15, t6psychicTankWeapon);
        weaponsList.put(16, t6elementalSupportWeapon);
        weaponsList.put(17, t6superSupportWeapon);
        weaponsList.put(18, t6psychicSupportWeapon);
    }

    public void initializeArmorsList() {
        Item freeHand = new Item("Free Hand", Attributes.Color.NONE, Attributes.ItemType.NONE, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 0, 0, 0, 0, 0, 0, 0, movesList.get(0), 0);
        Item t1neutralArmor = new Item("Leather Worn", Attributes.Color.BROWN, Attributes.ItemType.ARMOR, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 25, 50, 50, 0, 0, 10, 0, movesList.get(0), 1);
        Item t2neutralArmor = new Item("Chain Mail", Attributes.Color.GRAY, Attributes.ItemType.ARMOR, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 50, 100, 75, 0, 0, 20, 0, movesList.get(0), 2);
        Item t3neutralArmor = new Item("Steel Body Plate", Attributes.Color.GRAY, Attributes.ItemType.ARMOR, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 75, 300, 100, 1, 1, 30, 0, movesList.get(0), 3);

        armorsList.put(0, freeHand);
        armorsList.put(1, t1neutralArmor);
        armorsList.put(2, t2neutralArmor);
        armorsList.put(3, t3neutralArmor);
    }

    public void initializeTalismansList() {
        Item freeHand = new Item("Free Hand", Attributes.Color.NONE, Attributes.ItemType.NONE, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 0, 0, 0, 0, 0, 0, 0, movesList.get(0), 0);
        Item amber= new Item("Amber", Attributes.Color.ORANGE, Attributes.ItemType.TALISMAN, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 25, 25, 50, 1, 1, 10, 10, movesList.get(0), 1);

        talismansList.put(0, freeHand);
        talismansList.put(1, amber);
    }

    public void initializeConsumablesList() {
        Item freeHand = new Item("Free Hand", Attributes.Color.NONE, Attributes.ItemType.NONE, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 0, 0, 0, 0, 0, 0, 0, movesList.get(0), 0);
        Item apricot = new Item("Apricot", Attributes.Color.YELLOW, Attributes.ItemType.CONSUMABLE, Attributes.SkillType.NONE, Attributes.ClassType.NONE, 0, 0, 0, 0, 0, 0, 100, movesList.get(0), 1);

        consumablesList.put(0, freeHand);
        consumablesList.put(1, apricot);
    }

    //note to dev: enemies and items need to be created on call and not created first and saved for later use...
    // call function using enemy=new enemy and with weapons and items and so on
    public void initializeEnemiesList() {
        Enemy grunt = new Enemy("Grunt", 1, 5, 50, 50, 10, 1, Attributes.SkillType.NONE, Attributes.ClassType.NONE, weaponsList.get(1));
        Enemy stoneHead = new Enemy("Stone Head", 2, 10, 500, 500, 1, 1, Attributes.SkillType.NONE, Attributes.ClassType.NONE, weaponsList.get(12));
        Enemy goon = new Enemy("Goon", 3, 15, 200, 300, 40, 25, Attributes.SkillType.NONE, Attributes.ClassType.FIGHTER, weaponsList.get(4));
        enemiesList.put(0, grunt);
        enemiesList.put(1, stoneHead);
        enemiesList.put(2, goon);
    }

    public int calculateDamage (Player plyr) {
        int totalCritRate = plyr.getCritrate() + (plyr.getEquipWeapon()).getCritrateBoost() + (plyr.getEquipArmor()).getCritrateBoost() + (plyr.getEquipTalisman()).getCritrateBoost();
        int totalCritDamageMulti = plyr.getCritdmgMulti() + (plyr.getEquipWeapon()).getCritdmgMultiBoost() + (plyr.getEquipArmor()).getCritdmgMultiBoost() + (plyr.getEquipTalisman()).getCritdmgMultiBoost();
        int totalBaseDamage = plyr.getAttack() + plyr.getEquipWeapon().getAttackBoost() + plyr.getEquipArmor().getAttackBoost() + plyr.getEquipTalisman().getAttackBoost();
        int critCalc = rand.nextInt(100);
        int totalDamage = totalBaseDamage;
        if (critCalc < totalCritRate) {
            totalDamage = totalBaseDamage * totalCritDamageMulti;
            System.out.println("You hit a critical hit! Damage was multiplied by " + totalCritDamageMulti + "!!!");
        }
        return totalDamage;
    }

    public int gameStartMenu(Player plyr) {
        if (!(plyr.getPlayerClass() == Attributes.ClassType.NONE || plyr.getPlayerSkill() == Attributes.SkillType.NONE )) {
            System.out.println("Current player build:\n");
            printPlayerStats(plyr);
        }
        System.out.println("===MAIN MENU===\nEnter one of the options below.\n");
        System.out.println(">New character\n>Continue game\n>Endless mode\n>Exit game\n");
        String input = scan.nextLine();
        while (!(input.equals("New game") && input.equals("Continue game") && input.equals("Exit game"))) {
            switch (input) {
                case "New character":
                case "new character":
                case "NEW CHAR":
                case "new char":
                case "new":
                case "N":
                case "n":
                    return 1;
                case "Continue game":
                case "continue game":
                case "continue":
                case "C":
                case "c":
                    return 2;
                case "Endless mode":
                case "endless mode":
                case "Endless":
                case "endless":
                    return 3;
                case "Exit game":
                case "exit game":
                case "exit":
                case "E":
                case "e":
                    return 4;
                default:
                    System.out.println(input + " is not an available option. Please try again.\n");
                    break;
            }
            System.out.println(">New character\n>Continue game\nEndless mode\n>Exit game\n");
            input = scan.nextLine();
        }
        return 0;
    }

    public void enemyEncounter(Player plyr, Enemy enemy) {
        System.out.println("*******" + enemy.getEnemyName() + " approaches!*******");
        while (enemy.getHp() > 0 || plyr.getHp() > 0) {
            System.out.println(enemy);
            System.out.println(enemy.getEnemySkill() + " TYPE " + enemy.getEnemyClass() + "\n");
            printPlayerStats(plyr);
            System.out.println("\nSelect an action...\n>Attack\n>Block\n>Skill\n>Item\n>Other\n");
            String input = scan.nextLine();
            boolean blocking = false;
            switch(input) {
                case "ATTACK":
                case "Attack":
                case "attack":
                case "A":
                case "a":
                    enemy.enemyHurt(plyr, calculateDamage(plyr));
                    break;
                case "BLOCK":
                case "Block":
                case "block":
                case "B":
                case "b":
                    blocking = true;
                    break;
                case "SKILL":
                case "Skill":
                case "skill":
                case "S":
                case "s":
                    plyr.playerUseSkill(enemy);
                    break;
                case "ITEM":
                case "Item":
                case "item":
                case "I":
                case "i":
                    plyr.playerUseItem(enemy);
                    break;
                case "OTHER":
                case "Other":
                case "other":
                case "O":
                case "o":
                case "QUIT":
                case "Quit":
                case "quit":
                case "Q":
                case "q":
                case "EXIT":
                case "Exit":
                case "exit":
                case "E":
                case "e":
                    System.out.println("Would you like to quit?");
                    input = scan.nextLine();
                    if ((input.contains("YES") || input.contains("Yes") || input.contains("yes") || input.equals("Y") || input.equals("y"))) {
                        plyr.setHp(0);
                    }
                default:
                    System.out.println(input + " is not an available option... try again");
                    break;
            }
            if (plyr.getHp() <= 0) {
                System.out.println(plyr.getName() + " died a tragic death against the LVL " + enemy.getLvl() + " " + enemy.getEnemyName() + "...\nThis fight will surely serve as good reference for the next hero who steps up to the challenge...");
                break;
            }else if (enemy.getHp() <= 0) {
                System.out.println(plyr.getName() + " defeated the LVL " + enemy.getLvl() + " " + enemy.getEnemyName() + "! Here's to more victorious battles in the future!");
                plyr.earnBattleXp(plyr.getXPBoost(plyr, enemy));
                break;
            }
            System.out.println(enemy.getEnemyName() + " is attacking!");
            if (blocking) {
                plyr.playerBlock(enemy);
            }else {
                plyr.playerHurt(enemy);
            }

        }



    }

    public void fillPlayerStats(Player plyr) throws IOException, InterruptedException {
        boolean satisfied = false;

        while (!satisfied) {
            System.out.println( ">Enter a title (MR, MS, MRS, DR).\n" );
            plyr.setTitle(scan.nextLine());

            System.out.println( ">Enter a first name.\n" );
            plyr.setFirstName(scan.nextLine());

            System.out.println( ">Enter a last name.\n" );
            plyr.setLastName(scan.nextLine());

            System.out.println( ">Enter your hair color (RED, GREEN, BLUE, BLACK, BROWN, GRAY, YELLOW, ORANGE, PURPLE).\n" );
            plyr.setHairColor(scan.nextLine());

            System.out.println( ">Enter your age.\n" );
            plyr.setAge(Integer.parseInt(scan.nextLine()));

            System.out.println( ">Enter your height (reference: 0-29 considered \"short\", 30-59 considered \"average\"\nand 60-100 considered \"tall\".).\n" );
            plyr.setHeight(Double.parseDouble(scan.nextLine()));

            System.out.println( ">Choose your player skill type... (ELEMENTAL, SUPER, PSYCHIC).\n" );
            plyr.setPlayerSkill(scan.nextLine());

            System.out.println( ">Choose your player class type... (FIGHTER, TANK, SUPPORT).\n" );
            plyr.setPlayerClass(scan.nextLine());

            printPlayerStats(plyr);
            System.out.println("Are you satisfied with these stats?");
            String input = scan.nextLine();
            if (input.contains("YES") || input.contains("Yes") || input.contains("yes") || input.equals("Y") || input.equals("y")) {
                satisfied = true;
            }
            else {
                System.out.println("Restarting...");
            }
        }

        System.out.println(">End of setting player stats...\n");
    }



    public void beginNewGame(Player plyr) {
        System.out.println("######################################################################\n#########################New Game Has Begun!##########################\n######################################################################");
        System.out.print(plyr.getFullName() + " was your average ");
        switch (plyr.getTitle()) {
            case MR:
                System.out.print("man, he kept mostly to himself and took on challenges as he saw fit.");
                break;
            case MS:
                System.out.print("woman, she kept mostly to herself and kept an eye out for adventures at every corner.");
                break;
            case MRS:
                System.out.print("woman, she had a husband who was deep in work and dreamed about adventures waiting to be had in the world around her.");
                break;
            case DR:
                System.out.print("scholar, they were intelligent and hardworking to a degree that is tough even to think about.");
                break;
            default:
                break;
        }
        scan.nextLine();
        System.out.println("However, for a long time, there came no opportunity for adventure into their life.");
        scan.nextLine();
        System.out.println("Now, " + plyr.getName() + " was by no means a restless individual.\nBut, under these circumstances, anybody living in a hillside away from most civilization\nwould eventually find the constant peace somewhat undesirable.");
        scan.nextLine();
        System.out.println("Especially our hero here.\nLuckily for them, this agitation would not last long.");
        scan.nextLine();
        System.out.println("One day, a knock is heard at the front door of " + plyr.getName() + "'s house.");
        scan.nextLine();
        switch (plyr.getTitle()) {
            case MR:
                System.out.println("When he went to open the door, he found a man dressed in mail dispersal attire standing there,\nwith an ecstatic expression on his face.\nWhatever this man had to say, good or bad, could be what " + plyr.getName() + " was looking for.");
                break;
            case MS:
                System.out.println("When she went to open the door, she found a man dressed in mail dispersal attire standing there,\nwith an ecstatic expression on his face.\nIf the news are well, this could be the adventure " + plyr.getName() + " was waiting for.");
                break;
            case MRS:
                System.out.println("When she went to answer the door, she found a man dressed in fighter clothes,\nwho had a gloomy expression on his face.\n" + plyr.getName() + " was getting uneasy. Whatever the man had to say, did not look like good news.");
                break;
            case DR:
                System.out.println("They took to answering the door, where the most unexpected had occurred.\nBehind the door was a fighter brandishing a dagger, seemingly ready to lunge and loot whatever he could find inside.\nHaving had nearly no excitement in forever, the nerves in " + plyr.getName() + "'s body signaling to move quickly felt like to them a bolt of lightning through their body.");
                break;
            default:
                break;
        }
        scan.nextLine();
    }
    public void continueGame() {
        System.out.println(">Please enter your continue game code: \n");
        String cgc = scan.nextLine();
        System.out.println(cgc);
        System.out.println(">This game code seems incorrect, sorry!\n");
    }

    public void exitGame() {
        System.out.println(">See you next time!\n");
    }

    public void printPlayerStats(Player plyr) {
        System.out.println(plyr);
        plyr.printPlayerStats();
    }


}