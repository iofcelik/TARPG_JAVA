package systems;

public class Enemy extends Attributes{
    private String enemyName;       //Enemy name
    private int lvl;                //Enemy level
    private int xp;                 //Enemy experience points given to player upon defeat
    private int hp;                 //Enemy Health points
    private int hpMAX;              //Enemy maximum HP
    private int attack;             //Enemy Attack points
    private int defense;            //Enemy Defense points
    private SkillType enemySkill;   //Enemy skill type
    private ClassType enemyClass;   //Enemy class type
    private Item loot;              //Loot dropped upon enemy defeat


    public Enemy(String enemyName, int lvl, int xp, int hp, int hpMAX, int attack, int defense, SkillType enemySkill, ClassType enemyClass, Item loot) {
        this.enemyName = enemyName;
        this.lvl = lvl;
        this.xp = xp;
        this.hp = hp;
        this.hpMAX = hpMAX;
        this.attack = attack;
        this.defense = defense;
        this.enemySkill = enemySkill;
        this.enemyClass = enemyClass;
        this.loot = loot;


    }

    public String toString() {
        return "LVL " + this.lvl + " " + this.enemyName + ": " + this.hp + "/" + this.hpMAX + " HP";
    }

    public void enemyHurt(Player plyr, int playerDamage) {
        int damageValue = playerDamage - this.defense;
        if (damageValue < 0) {
            damageValue = 0;
        }
        this.hp -= damageValue;
        System.out.println(this.getEnemyName() + " took " + damageValue + " damage!");
    }

    public void enemyDeath(Player plyr) {

    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
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

    public SkillType getEnemySkill() {
        return enemySkill;
    }

    public void setEnemySkill(SkillType enemySkill) {
        this.enemySkill = enemySkill;
    }

    public ClassType getEnemyClass() {
        return enemyClass;
    }

    public void setEnemyClass(ClassType enemyClass) {
        this.enemyClass = enemyClass;
    }

    public Item getLoot() {
        return loot;
    }

    public void setLoot(Item loot) {
        this.loot = loot;
    }
}