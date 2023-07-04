package org.enumgame;

import java.util.Random;

public abstract class Character {

    private String name;
    private int damage;
    private int speed;
    private int healthPoint;
    private int armor;
    private Type type;

    public Character(String name, Type type) {
        this.name = name;
        this.healthPoint = 50;
        this.damage = 30;
        this.speed = 20;
        this.armor = 0;
        setUp(type);
    }

    public Character(String name) {
        this.name = name;
        this.healthPoint = 50;
        this.damage = 30;
        this.speed = 20;
        this.armor = 0;
        setUp(addingRandomType());
    }

    private Type addingRandomType() {

        int numberOfTypes = Type.values().length;
        Random random = new Random();
        int randomIndexOfType = random.nextInt(numberOfTypes);
        Type type = Type.values()[randomIndexOfType];


        return type;
    }

    private void setUp(Type type) {
        this.type = type;
        this.damage += type.getDamage();
        this.speed += type.getSpeed();
        this.healthPoint += type.getHealthPoint();
        this.armor += type.getArmor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
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
