import Player.Creature;
import Player.Med;
import Player.MoveType;
import Player.Wizard;
import Room.Badoi;
import Room.Enemy;
import Room.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MedTest {

    Med med;
    Enemy enemy;
    Treasure treasure;
    Wizard wizard;

    @Before
    public void before(){
        med = new Med(100, MoveType.COCODOMAL, new ArrayList<Treasure>());
        enemy = new Enemy(Badoi.THATCHER, 100, 20);
    }

    @Test
    public void cannotDoDamage(){
        med.canAttack(enemy);
        assertEquals(100, enemy.getHealth());
    }

    @Test
    public void canGetHit(){
        med.getHit(enemy);
        assertEquals(80, med.getHealth(), 0);
    }

    @Test
    public void canHeal(){
        med.getHit(enemy);
        med.heal(med);
        assertEquals(120, med.getHealth(), 0);
    }

    @Test
    public void canHealOthers(){
        wizard = new Wizard(100, MoveType.AVADAKEDAVRA, new ArrayList<Treasure>(), Creature.DRAGON);
        wizard.getHit(enemy);
        med.heal(wizard);
        assertEquals(120, wizard.getHealth(), 0);
    }
}
