import Player.Knight;
import Player.MoveType;
import Room.Badoi;
import Room.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Badoi badoi;
    Treasure treasure;

    @Before
    public void before(){
        knight = new Knight(100, MoveType.SWORD, new ArrayList<Treasure>(), 20);
        badoi = Badoi.GHOSTOFLIZZIE;
        treasure = Treasure.CELTICHOMETOP;
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(10, knight.damageEffect());
    }

    @Test
    public void canDamageBaddoi(){
        knight.canAttack(badoi);
        knight.canAttack(badoi);
        assertEquals(80, badoi.getHealth());
    }

    @Test
    public void canTakeDamage(){
        knight.getHit(badoi);
        assertEquals(70, knight.getHealth(), 0);
    }

    @Test
    public void canCollectTreasure(){
        knight.addTreasure(treasure);
        assertEquals(1, knight.getSwagBag().size());
    }

    @Test
    public void canChangeWeapon(){
        knight.changeMove(MoveType.AXE);
        knight.canAttack(badoi);
        assertEquals(65, badoi.getHealth());
        assertEquals(100, knight.getHealth(), 0);
    }

}
