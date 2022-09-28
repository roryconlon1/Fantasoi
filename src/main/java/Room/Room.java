package Room;

public class Room {

    private Badoi badoi;
    private Treasure treasure;
    private int roomNumber;
    private String name;


    public Room(Badoi badoi, Treasure treasure, int roomNumber, String name) {
        this.badoi = badoi;
        this.treasure = treasure;
        this.roomNumber = roomNumber;
        this.name = name;
    }

    public Badoi getBadoi() {
        return badoi;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }
}
