package org.enumgame;

public abstract class Character {

     private String name;
     private int healthPoint;
    private int damage;
    private int  speed;
    private int  armor;
    private String type;


    public Character(String name) {
        this.name = "name";
        this.healthPoint = 50;
        this.damage =30;
        this.speed = 20;
        this.armor = 0;
        this.type = "";

    }


    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
