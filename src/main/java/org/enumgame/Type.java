package org.enumgame;

public enum Type {

    ORC(10,-5,10,5,"ORC"),
    KNIGHT(5,20,-5,20,"KNIGHT"),
    WIZARD(-5,0,5,0,"WIZARD"),
    ASSASSIN(15,10,-5,0,"ASSASSIN");

    private final int damage;
    private final int speed;
    private final int healtpoints;
    private final int armor;
    private final String type;

    Type(int damage, int speed, int healtpoints, int armor, String type) {
        this.damage = damage;
        this.speed = speed;
        this.healtpoints = healtpoints;
        this.armor = armor;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealtpoints() {
        return healtpoints;
    }

    public int getArmor() {
        return armor;
    }

    public String getType() {
        return type;
    }
}
