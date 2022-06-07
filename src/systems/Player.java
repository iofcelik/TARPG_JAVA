package systems;

import java.util.HashMap;

public class Player extends Attributes {
    private Title title;                //Player respective title
    private String firstName;           //Player first name
    private String lastName;            //Player last name
    private Color hairColor;            //Player hair color
    private int age;                    //Player age
    private double height;              //Player height (in centimeters)
    private SkillType playerSkill;      //Player skill type
    private ClassType playerClass;      //player class type
    private int lvl;                    //Player level
    private int xp;                     //Player Experience Points
    private int hp;                     //Current Health points
    private int hpMAX;                  //Maximum Health points
    private int attack;                 //Attack points
    private int defense;                //Defense points
    private int critrate;               //Critical damage rate (%)
    private int critdmgMulti;           //Critical damage multiplier (Attack * Multiplier)
    private int itemLimit;              //Maximum item count (increases by player level)
    private HashMap<Integer, Item> inventory;  //Player inventory Hash Map consisting of item objects
    private int chapter;                //Chapter number within the game
    private Item equipWeapon;           //Current equipped weapon
    private Item equipArmor;            //Current equipped armor
    private Item equipTalisman;         //Current equipped talisman
    private HashMap<Item, Move> moveList;    //Moves acquired from all gear

    public Player(Title title, Color hairColor, int age, double height, SkillType playerSkill, ClassType playerClass, int lvl, int xp, int hp, int hpMAX, int attack, int defense, int critrate, int critdmgMulti, int itemLimit, int chapter, HashMap<Integer, Item> inventory, Item equipWeapon, Item equipArmor, Item equipTalisman) {
        this.title = title;
        this.hairColor = hairColor;
        this.age = age;
        this.height = height;
        this.playerSkill = playerSkill;
        this.playerClass = playerClass;
        this.lvl = lvl;
        this.xp = xp;
        this.hp = hp;
        this.hpMAX = hpMAX;
        this.attack = attack;
        this.defense = defense;
        this.critrate = critrate;
        this.critdmgMulti = critdmgMulti;
        this.itemLimit = itemLimit;
        this.chapter = chapter;
        this.inventory = inventory;
        this.equipWeapon = equipWeapon;
        this.equipArmor = equipArmor;
        this.equipTalisman = equipTalisman;

    }

    public String toString() {
        return title + " " + getName() + ", " + age + ", HAIR COLOR: " + hairColor;
    }



    public void printPlayerStats() {
        String retString = "HP: " + hp + "/" + hpMAX + "  LVL " + lvl + "  " + playerSkill + " TYPE " + playerClass + "\n" + "EQUIPPED: " + equipWeapon + ", " + equipArmor + ", " + equipTalisman + "\n";
        System.out.println(retString);
    }

    public void playerHurt(Enemy enemy) {
        int damageValue = enemy.getAttack() - this.defense;
        if (damageValue < 0) {
            damageValue = 0;
        }
        this.hp -= damageValue;
        System.out.println(this.getName() + " took " + damageValue + " damage!");
    }

    public void playerBlock(Enemy enemy) {
        int damageValue = enemy.getAttack() - (2 * this.defense);
        if (damageValue < 0) {
            damageValue = 0;
        }
        this.hp -= damageValue;
        System.out.println(this.getName() + " took " + damageValue + " damage while blocking!");
    }

    public void playerUseSkill(Enemy enemy) {
        System.out.println("These are your skills... enter the number for the move you wish to use...");
        for (int i = 0; i < inventory.size(); i++) {
            if (!(inventory.get(i).getType().equals(ItemType.CONSUMABLE))) {
                System.out.println(i + ": " + inventory.get(i).getItemName() + ">>" + inventory.get(i).getMove());
            }

        }

    }

    public void playerUseItem(Enemy enemy) {
        System.out.println("These are your Items... enter the number for the item you wish to use...");
        for (int i = 0; i < inventory.size(); i++) {
            if ((inventory.get(i).getType().equals(ItemType.CONSUMABLE))) {
                System.out.println(i + ": " + inventory.get(i).getItemName());
            }

        }
    }

    public int getXPBoost(Player plyr, Enemy enemy) {
        int totalXpBoost = (plyr.equipWeapon).getXpUP() + (plyr.equipArmor).getXpUP() + (plyr.equipTalisman).getXpUP() + enemy.getXp();
        return totalXpBoost;
    }

    //returns level number based on total xp
    public int earnBattleXp(int xpBoost) {
        if (this.xp < this.lvl * 10) {
            this.xp += 10 + xpBoost;
            if (this.xp >= this.lvl * 10) {
                this.xp =0;
                this.lvl += 1;
            }
        }
        else {
            this.xp = 0;
            this.lvl += 1;
        }
        System.out.println(getName() + "'s xp: " + this.xp);
        return this.lvl;
    }

    //@return the name
    public String getName() {
        return firstName;
    }

    public String getFullName() {
        return firstName  + " " + lastName;
    }

    public void setTitle(String title) {
        switch (title) {
            case "MR":
            case "Mr":
            case "mr":
                this.title = Title.MR;
                break;
            case "MS":
            case "Ms":
            case "ms":
                this.title = Title.MS;
                break;
            case "MRS":
            case "Mrs":
            case "mrs":
                this.title = Title.MRS;
                break;
            case "DR":
            case "Dr":
            case "dr":
                this.title = Title.DR;
                break;
            case "NONE":
            case "None":
            case "none":
                this.title = Title.NONE;
                break;
            default:
                System.out.println("Player title was not saved.\n");
                break;
        }
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    //@param name the name to set
    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public void setHairColor(String hairColor) {
        switch (hairColor) {
            case "RED":
            case "Red":
            case "red":
                this.hairColor = Color.RED;
                break;
            case "GREEN":
            case "Green":
            case "green":
                this.hairColor = Color.GREEN;
                break;
            case "BLUE":
            case "Blue":
            case "blue":
                this.hairColor = Color.BLUE;
                break;
            case "BLACK":
            case "Black":
            case "black":
                this.hairColor = Color.BLACK;
                break;
            case "BROWN":
            case "Brown":
            case "brown":
                this.hairColor = Color.BROWN;
                break;
            case "GRAY":
            case "Gray":
            case "gray":
                this.hairColor = Color.GRAY;
                break;
            case "YELLOW":
            case "Yellow":
            case "yellow":
                this.hairColor = Color.YELLOW;
                break;
            case "ORANGE":
            case "Orange":
            case "orange":
                this.hairColor = Color.ORANGE;
                break;
            case "PURPLE":
            case "Purple":
            case "purple":
                this.hairColor = Color.PURPLE;
                break;
            case "NONE":
            case "None":
            case "none":
                this.hairColor = Color.NONE;
                break;
            default:
                System.out.println("Player hair color was not saved.\n");
                break;
        }
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void setPlayerSkill(String playerSkill) {
        switch (playerSkill) {
            case "ELEMENTAL":
            case "Elemental":
            case "elemental":
            case "E":
            case "e":
                this.playerSkill = SkillType.ELEMENTAL;
                break;
            case "SUPER":
            case "Super":
            case "super":
            case "S":
            case "s":
                this.playerSkill = SkillType.SUPER;
                break;
            case "PSYCHIC":
            case "Psychic":
            case "psychic":
            case "P":
            case "p":
                this.playerSkill = SkillType.PSYCHIC;
                break;
            default:
                System.out.println("Player skill was not saved.\n");
                break;
        }
    }

    public void setPlayerSkill(SkillType playerSkill) {
        this.playerSkill = playerSkill;
    }

    public void setPlayerClass(String playerClass) {
        switch (playerClass) {
            case "FIGHTER":
            case "Fighter":
            case "fighter":
            case "F":
            case "f":
                this.playerClass = ClassType.FIGHTER;
                break;
            case "TANK":
            case "Tank":
            case "tank":
            case "T":
            case "t":
                this.playerClass = ClassType.TANK;
                break;
            case "SUPPORT":
            case "Support":
            case "support":
            case "S":
            case "s":
                this.playerClass = ClassType.SUPPORT;
                break;
            default:
                System.out.println("Player class was not saved.\n");
                break;
        }
    }

    public void setPlayerClass(ClassType playerClass) {
        this.playerClass = playerClass;
    }

    public Title getTitle() {
        return title;
    }
    public String getFormalName() {
        return this.title + ". " + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public SkillType getPlayerSkill() {
        return playerSkill;
    }

    public ClassType getPlayerClass() {
        return playerClass;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHpMAX() {
        return hpMAX;
    }

    public void setHpMAX(int hpMAX) {
        this.hpMAX = hpMAX;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getCritrate() {
        return critrate;
    }

    public void setCritrate(int critrate) {
        this.critrate = critrate;
    }

    public int getCritdmgMulti() {
        return critdmgMulti;
    }

    public void setCritdmgMulti(int critdmgMulti) {
        this.critdmgMulti = critdmgMulti;
    }

    public int getItemLimit() {
        return itemLimit;
    }

    public void setItemLimit(int itemLimit) {
        this.itemLimit = itemLimit;
    }

    public HashMap<Integer, Item> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<Integer, Item> inventory) {
        this.inventory = inventory;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public Item getEquipWeapon() {
        return equipWeapon;
    }

    public void setEquipWeapon(Item equipWeapon) {
        this.equipWeapon = equipWeapon;
    }

    public Item getEquipArmor() {
        return equipArmor;
    }

    public void setEquipArmor(Item equipArmor) {
        this.equipArmor = equipArmor;
    }

    public Item getEquipTalisman() {
        return equipTalisman;
    }

    public void setEquipTalisman(Item equipTalisman) {
        this.equipTalisman = equipTalisman;
    }
}
