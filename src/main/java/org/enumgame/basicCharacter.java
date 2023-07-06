package org.enumgame;

import java.util.Random;

public abstract class basicCharacter {

    private String name;
    private int healthPoint;
    private int damage;
    private int speed;
    private int armor;
    private Type type;

    public basicCharacter(String name, Type type) {
        this.name = name;
        this.healthPoint = 50;
        this.damage = 30;
        this.speed = 20;
        this.armor = 0;
        setUp(type);
    }

    public basicCharacter(String name) {
        this.name = name;
        this.healthPoint = 50;
        this.damage = 30;
        this.speed = 20;
        this.armor = 0;
        setUp(randomType());
    }

    private void setUp(Type type) {
        this.type = type;
        this.armor += type.getArmor();
        this.damage += type.getDamage();
        this.speed += type.getSpeed();
        this.healthPoint += type.getHealtPoints();
    }

    private Type randomType(){

        int numberOfType = Type.values().length;
        Random random = new Random();
        int rndIndex= random.nextInt(numberOfType);
        Type type = Type.values()[rndIndex];

        return type;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
