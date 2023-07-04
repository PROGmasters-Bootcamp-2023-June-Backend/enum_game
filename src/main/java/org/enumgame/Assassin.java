package org.enumgame;

public class Assassin extends Basic{

    public Assassin(String name) {

    }

    @Override
    public Type getType() {
        return Type.ASSASSIN;
    }

    @Override
    public int getDamage() {
        return Type.ASSASSIN.getDamage()+super.getDamage();

    }

    @Override
    public int getSpeed() {
        return Type.ASSASSIN.getSpeed()+super.getSpeed();
    }

    @Override
    public int getHealthPoint() {
        return Type.ASSASSIN.getHealthPoint()+super.getHealthPoint();

    }

    @Override
    public int getArmor() {
        return Type.ASSASSIN.getArmor()+super.getArmor();
    }
}
