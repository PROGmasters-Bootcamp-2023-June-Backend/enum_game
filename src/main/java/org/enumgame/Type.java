package org.enumgame;

public enum Type {

    ASSASSIN(15, 10, -5, 0, "ASSASSIN"),
    ORC( 10, -5, 10, 5, "ORC"),
    KNIGHT(5, 20, -5, 20, "KNIGHT"),
    WIZARD(-5, 0, 5, 0, "WIZARD");

    private final int damage;
    private final int speed;
    private final int healthpoints;
    private final int armor;
    private final String type;

    Type(int damage, int speed, int healthpoints, int armor, String type) {
        this.damage = damage;
        this.speed = speed;
        this.healthpoints = healthpoints;
        this.armor = armor;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealthpoints() {
        return healthpoints;
    }

    public int getArmor() {
        return armor;
    }

    public String getType() {
        return type;
    }
}
