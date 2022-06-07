package systems;

public class Move extends Attributes {
    private String moveName;            //Move name
    private MoveType moveType;          //Move type
    private SkillType moveSkill;        //Item skill type, boosted stats for matching skill type with player
    private ClassType moveClass;        //Item class type, boosted stats for matching class type with player

    public Move (String moveName, MoveType moveType, SkillType moveSkill, ClassType moveClass) {
        this.moveName = moveName;
        this.moveType = moveType;
        this.moveSkill = moveSkill;
        this.moveClass = moveClass;
    }

    public String toString() {
        return this.moveSkill + " " + this.moveClass + " ::" + this.moveName;
    }

    public String getMoveName() {
        return moveName;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    public SkillType getMoveSkill() {
        return moveSkill;
    }

    public void setMoveSkill(SkillType moveSkill) {
        this.moveSkill = moveSkill;
    }

    public ClassType getMoveClass() {
        return moveClass;
    }

    public void setMoveClass(ClassType moveClass) {
        this.moveClass = moveClass;
    }
}
