package org.enumgame;

public abstract class Character {
    private String name;
    private int healthPoint = 50;
    private int damage = 30;
    private int speed = 20;
    private int armor = 0;


    public Character(String name, Type type) {
        this.name = name;
        setUp(type);

    }

    private void setUp(Type type) {
        if (type == Type.ASSASSIN) {
            setUpAssassin();
        }
        if (type == Type.ORC) {
            setUpOrc();
        }
        if (type == Type.WIZARD) {
            setUpWizard();
        }
        if (type == Type.KNIGHT) {
            setUpKnight();
        }
    }

    private void setUpAssassin() {
        this.damage += 15;
        this.speed += 10;
        this.healthPoint -= 5;

    }

    private void setUpWizard() {
        this.damage -= 5;
        this.healthPoint += 5;
    }

    private void setUpKnight() {
        this.damage += 5;
        this.speed += 20;
        this.healthPoint -= 5;
        this.armor += 20;
    }

    private void setUpOrc() {
        this.damage += 10;
        this.speed -= 5;
        this.healthPoint += 10;
        this.armor += 5;

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
}
