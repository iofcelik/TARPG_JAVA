package systems;

public class Attributes{
    /*
    private int xp;
    private int hp;
    private int hpMAX;
    private int attack;
    private int defense;
    private int critRate;
    private int critdmgMulti;
    */
    public enum Title {
        MR, MS, MRS, DR, NONE
    }

    public enum Color {
        RED, GREEN, BLUE, BLACK, BROWN, GRAY, YELLOW, ORANGE, PURPLE, NONE
    }

    public enum SkillType {
        ELEMENTAL, SUPER, PSYCHIC, NONE
    }

    public enum ClassType {
        FIGHTER, TANK, SUPPORT, NONE
    }

    public enum ItemType {
        WEAPON, ARMOR, TALISMAN, CONSUMABLE, NONE
    }

    public enum MoveType {
        ATTACK, BLOCK, COUNTER, HEAL, BOOST, NONE
    }

}