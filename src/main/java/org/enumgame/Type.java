package org.enumgame;

public enum Type {

    ORC(10,10,-5,5),

    KNIGHT(-5,5,20,20),

    WIZARD(5,-5,0,0),

    ASSASSIN(-5,15,10,0);



    private final int healthPoint;

    private final int damage;

    private final int speed;

    private final int armor;


    Type(int healthPoint, int damage, int speed, int armor) {
        this.healthPoint = healthPoint;
        this.damage = damage;
        this.speed = speed;
        this.armor = armor;
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
}
