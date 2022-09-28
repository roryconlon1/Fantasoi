package Player;

public enum MoveType {
    SWORD(0, 10),
    AXE(0, 15),
    BOWANDARROW(0, 20),
    KAR98K(0, 99),
    FIREBALL(0, 25),
    FROZONE(0, 30),
    AVADAKEDAVRA(0, 100),
    EXPELLIARMUS(0, 15),
    PARACETEMOL(10, 0),
    IBUPROFEN(20, 0),
    COCODOMAL(40, 0);

    private int healthEffect;
    private int damageEffect;

    MoveType(int healthEffect, int damageEffect) {
        this.healthEffect = healthEffect;
        this.damageEffect = damageEffect;
    }

    public int getHealthEffect() {
        return healthEffect;
    }

    public void setHealthEffect(int healthEffect) {
        this.healthEffect = healthEffect;
    }

    public int getDamageEffect() {
        return damageEffect;
    }

    public void setDamageEffect(int damageEffect) {
        this.damageEffect = damageEffect;
    }
}
