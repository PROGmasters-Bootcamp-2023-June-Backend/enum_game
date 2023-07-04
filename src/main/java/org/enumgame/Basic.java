package org.enumgame;

public abstract class  Basic {
    private  int damage=30;
    private  int speed=20;
    private  int healthPoint=50;
    private  int armor=0;


    public abstract Type getType();

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealthPoint(){
        return healthPoint;
    }

    public int getArmor() {
        return armor;
    }


}
