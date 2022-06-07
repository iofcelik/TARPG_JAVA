package systems;

import java.util.HashMap;

public class Item extends Attributes{
    private String itemName;         //Item name
    private Color itemColor;        //Color of the item
    private ItemType type;          //Item type
    private SkillType itemSkill;    //Item skill type, boosted stats for matching skill type with player
    private ClassType itemClass;    //Item class type, boosted stats for matching class type with player
    private int attackBoost;        //Attack boost given by item (only applied while equipped)
    private int defenseBoost;       //Defense boost given by item (only applied while equipped)
    private int hpMaxBoost;         //Maximum health boost given by item (only applied while equipped)
    private int critrateBoost;      //Critical damage boost given by item (only applied while equipped)
    private int critdmgMultiBoost;  //Critical damage multiplier boost given by item (only applied while equipped)
    private int xpUP;               //XP points provided by item (only for consumables)
    private int hpUP;               //HP points provided by item (only for consumables)
    private Move move;              //Unique move attributed to item
    private int tier;               //Tier level of item

    public Item(String itemName, Color itemColor, ItemType type, SkillType itemSkill, ClassType itemClass, int attackBoost, int defenseBoost, int hpMaxBoost, int critrateBoost, int critdmgMultiBoost, int xpUP, int hpUP,Move move, int tier) {
        this.itemName = itemName;
        this.itemColor = itemColor;
        this.type = type;
        this.itemSkill = itemSkill;
        this.itemClass = itemClass;
        this.attackBoost = attackBoost;
        this.defenseBoost = defenseBoost;
        this.hpMaxBoost = hpMaxBoost;
        this.critrateBoost = critrateBoost;
        this.critdmgMultiBoost = critdmgMultiBoost;
        this.xpUP = xpUP;
        this.hpUP = hpUP;
        this.move = move;
        this.tier = tier;
    }




    public String toString() {
        return this.type + ": " + this.itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Color getItemColor() {
        return itemColor;
    }

    public void setItemColor(Color itemColor) {
        this.itemColor = itemColor;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public SkillType getItemSkill() {
        return itemSkill;
    }

    public void setItemSkill(SkillType itemSkill) {
        this.itemSkill = itemSkill;
    }

    public ClassType getItemClass() {
        return itemClass;
    }

    public void setItemClass(ClassType itemClass) {
        this.itemClass = itemClass;
    }

    public int getAttackBoost() {
        return attackBoost;
    }

    public void setAttackBoost(int attackBoost) {
        this.attackBoost = attackBoost;
    }

    public int getDefenseBoost() {
        return defenseBoost;
    }

    public void setDefenseBoost(int defenseBoost) {
        this.defenseBoost = defenseBoost;
    }

    public int getHpMaxBoost() {
        return hpMaxBoost;
    }

    public void setHpMaxBoost(int hpMaxBoost) {
        this.hpMaxBoost = hpMaxBoost;
    }

    public int getCritrateBoost() {
        return critrateBoost;
    }

    public void setCritrateBoost(int critrateBoost) {
        this.critrateBoost = critrateBoost;
    }

    public int getCritdmgMultiBoost() {
        return critdmgMultiBoost;
    }

    public void setCritdmgMultiBoost(int critdmgMultiBoost) {
        this.critdmgMultiBoost = critdmgMultiBoost;
    }

    public int getXpUP() {
        return xpUP;
    }

    public void setXpUP(int xpUP) {
        this.xpUP = xpUP;
    }

    public int getHpUP() {
        return hpUP;
    }

    public void setHpUP(int hpUP) {
        this.hpUP = hpUP;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}