package org.enumgame;

public enum Type {

        ORC(10,-5,10,5),
        KNIGHT(5,20,-5,20),
        WIZARD(-5,0,5,0),
        ASSASSIN(15,10,-5,0);

    private final int damage;
    private final int speed;
    private final int healtPoints;
    private final int armor;

    Type(int damage, int speed, int healtPoints, int armor) {
        this.damage = damage;
        this.speed = speed;
        this.healtPoints = healtPoints;
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealtPoints() {
        return healtPoints;
    }

    public int getArmor() {
        return armor;
    }


}
