package Player;

import Room.Treasure;

import java.util.ArrayList;

public class Barbarian extends Player {

    private int muscle;

    public Barbarian(Integer health, MoveType moveType, ArrayList<Treasure> swagBag, int muscle) {
        super(health, moveType, swagBag);
        this.muscle = muscle;
    }
}
