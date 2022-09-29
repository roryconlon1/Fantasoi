package Player;

import Room.Badoi;
import Room.Enemy;
import Room.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private Integer health;
    private MoveType moveType;
    private ArrayList<Treasure> swagBag;

    public Player(Integer health, MoveType moveType, ArrayList<Treasure> swagBag) {
        this.health = health;
        this.moveType = moveType;
        this.swagBag = swagBag;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    public ArrayList<Treasure> getSwagBag() {
        return swagBag;
    }

    public void setSwagBag(ArrayList<Treasure> swagBag) {
        this.swagBag = swagBag;
    }

    public int damageEffect(){
        return getMoveType().getDamageEffect();
    }

    public void getHit(Enemy enemy){
        setHealth(getHealth() - enemy.getHitDamage());
    }

    public void addTreasure(Treasure treasure){
        swagBag.add(treasure);
    }

    public void canAttack(Enemy enemy){
        if (enemy.getHealth() < 1){
            enemy.setBadoi(Badoi.NONE);
            enemy.setHealth(getMoveType().getDamageEffect());
        }
        enemy.setHealth(enemy.getHealth() - getMoveType().getDamageEffect());
    }

    public void changeMove(MoveType moveType){
        setMoveType(moveType);
    }

}
