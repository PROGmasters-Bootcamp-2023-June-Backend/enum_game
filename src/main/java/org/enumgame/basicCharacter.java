package org.enumgame;

public abstract class basicCharacter {


    private String name;
    private int healthPoint;
    private int damage;
    private int speed;
    private int armor;
    private Type characters;

    public basicCharacter(String name) {
        this.name = name;
        this.characters = characters;
        this.healthPoint = 50;
        this.damage = 30;
        this.speed = 20;
        this.armor = 0;

    }

    public basicCharacter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Type getCharacters() {
        return characters;
    }

    public void setCharacters(Type characters) {
        this.characters = characters;
    }
}
