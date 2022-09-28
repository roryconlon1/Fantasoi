import Room.Room;
import org.junit.Before;
import Room.Badoi;
import Room.Treasure;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room(Badoi.THATCHER, Treasure.CELTICHOMETOP, 1, "Hogwarts");
    }

}
