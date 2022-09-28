package Player;

import Room.Treasure;

import java.util.ArrayList;

public class Dwarf extends Player{

    private int speed;

    public Dwarf(Integer health, MoveType moveType, ArrayList<Treasure> swagBag, int speed) {
        super(health, moveType, swagBag);
        this.speed = speed;
    }
}
