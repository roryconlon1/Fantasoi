import Player.Knight;
import Player.MoveType;
import Room.Badoi;
import Room.Enemy;
import Room.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemy enemy;
    Treasure treasure;

    @Before
    public void before(){
        knight = new Knight(100, MoveType.SWORD, new ArrayList<Treasure>(), 20);
        enemy = new Enemy(Badoi.VOLDEMORT, 100, 40);
        treasure = Treasure.CELTICHOMETOP;
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(10, knight.damageEffect());
    }

    @Test
    public void canDamageBaddoi(){
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        assertEquals(80, enemy.getHealth());
    }

    @Test
    public void canTakeDamage(){
        knight.getHit(enemy);
        assertEquals(80, knight.getHealth(), 0);
    }

    @Test
    public void canCollectTreasure(){
        knight.addTreasure(treasure);
        assertEquals(1, knight.getSwagBag().size());
    }

    @Test
    public void canChangeWeapon(){
        knight.changeMove(MoveType.AXE);
        knight.canAttack(enemy);
        assertEquals(85, enemy.getHealth());
    }

    @Test
    public void canKill(){
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        assertEquals(10, enemy.getHealth());
        assertEquals(Badoi.VOLDEMORT, enemy.getBadoi());
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        knight.canAttack(enemy);
        assertEquals(Badoi.NONE, enemy.getBadoi());
        assertEquals(0, enemy.getHealth());

    }

}
