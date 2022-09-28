package Room;

public enum Treasure {
    GOLD(100),
    SILVER(90),
    DIAMOND(110),
    CELTICHOMETOP(1967),
    SIGNEDHENRIKLARSSONTOP(1888),
    FIVER(5),
    NONE(0);

    private int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
