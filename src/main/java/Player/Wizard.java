package Player;

import Room.Treasure;

import java.util.ArrayList;

public class Wizard extends Player{

    private Creature creature;

    public Wizard(Integer health, MoveType moveType, ArrayList<Treasure> swagBag, Creature creature) {
        super(health, moveType, swagBag);
        this.creature = creature;
    }
}
