package Player;

public enum Creature {

    DRAGON(20, 20),
    HEDWIG(10, 10),
    LION(15, 15),
    UNICORN(25, 25),
    TINKERBELL(5, 5);

    private int healthBoost;
    private int attackBoost;

    Creature(int healthBoost, int attackBoost) {
        this.healthBoost = healthBoost;
        this.attackBoost = attackBoost;
    }

    public int getHealthBoost() {
        return healthBoost;
    }

    public void setHealthBoost(int healthBoost) {
        this.healthBoost = healthBoost;
    }

    public int getAttackBoost() {
        return attackBoost;
    }

    public void setAttackBoost(int attackBoost) {
        this.attackBoost = attackBoost;
    }
}
