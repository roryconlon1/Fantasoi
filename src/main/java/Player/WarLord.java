package Player;

import Room.Treasure;

import java.util.ArrayList;

public class WarLord extends Player{

    private Creature creature;

    public WarLord(Integer health, MoveType moveType, ArrayList<Treasure> swagBag, Creature creature) {
        super(health, moveType, swagBag);
        this.creature = creature;
    }
}
