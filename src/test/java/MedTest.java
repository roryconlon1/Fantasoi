import Player.Creature;
import Player.Med;
import Player.MoveType;
import Player.Wizard;
import Room.Badoi;
import Room.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MedTest {

    Med med;
    Badoi badoi;
    Treasure treasure;
    Wizard wizard;

    @Before
    public void before(){
        med = new Med(100, MoveType.COCODOMAL, new ArrayList<Treasure>());
        badoi = Badoi.THATCHER;
    }

    @Test
    public void cannotDoDamage(){
        med.canAttack(badoi);
        assertEquals(100, badoi.getHealth());
    }

    @Test
    public void canGetHit(){
        med.getHit(badoi);
        assertEquals(85, med.getHealth(), 0);
    }

    @Test
    public void canHeal(){
        med.getHit(badoi);
        med.heal(med);
        assertEquals(125, med.getHealth(), 0);
    }

    @Test
    public void canHealOthers(){
        wizard = new Wizard(100, MoveType.AVADAKEDAVRA, new ArrayList<Treasure>(), Creature.DRAGON);
        wizard.getHit(badoi);
        med.heal(wizard);
        assertEquals(125, wizard.getHealth(), 0);
    }
}
