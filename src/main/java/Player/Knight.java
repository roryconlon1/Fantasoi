package Player;

import Moves.IAttack;
import Room.Badoi;
import Room.Enemy;
import Room.Room;
import Room.Treasure;

import java.util.ArrayList;

public class Knight extends Player {

    private int armour;

    public Knight(Integer health, MoveType moveType, ArrayList<Treasure> swagBag, int armour) {
        super(health, moveType, swagBag);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }


    public void getHit(Enemy enemy){
        setHealth(getHealth() - (enemy.getHitDamage() - getArmour()));
    }

}
