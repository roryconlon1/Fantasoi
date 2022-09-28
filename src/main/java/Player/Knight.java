package Player;

import Moves.IAttack;
import Room.Badoi;
import Room.Treasure;

import java.util.ArrayList;

public class Knight extends Player implements IAttack {

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


    public void getHit(Badoi badoi){
        setHealth(getHealth() - (badoi.getHitPower() - getArmour()));
    }




}
