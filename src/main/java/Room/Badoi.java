package Room;

public enum Badoi {

    GOBLIN(100, 10),
    VOLDEMORT(100, 30),
    HITLER(100, 9),
    THATCHER(100, 15),
    GHOSTOFLIZZIE(100, 50),
    NONE(0, 0);

    private int health;
    private int hitPower;

    Badoi(int health, int hitPower) {
        this.health = health;
        this.hitPower = hitPower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHitPower() {
        return hitPower;
    }

    public void setHitPower(int hitPower) {
        this.hitPower = hitPower;
    }

}
