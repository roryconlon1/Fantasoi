package Player;

import Room.Treasure;

import java.util.ArrayList;

public class Med extends Player {
    public Med(Integer health, MoveType moveType, ArrayList<Treasure> swagBag) {
        super(health, moveType, swagBag);
    }

    public void heal(Player player){
        player.setHealth(player.getHealth() + getMoveType().getHealthEffect());
    }
}
