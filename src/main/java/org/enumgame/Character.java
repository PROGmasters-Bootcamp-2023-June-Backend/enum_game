package org.enumgame;

public abstract class Character {

    protected String name;
    protected int healthPoint;
    protected int damage;
    protected int speed;
    protected int armor;
    protected Type type;

    public Character(String name) {
        this.name = name;
        this.healthPoint = 50;
        this.damage = 30;
        this.speed = 20;
        this.armor = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmor() {
        return armor;
    }

    public Type getType() {
        return type;
    }
}
