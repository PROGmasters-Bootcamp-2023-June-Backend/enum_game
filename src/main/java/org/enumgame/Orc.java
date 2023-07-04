package org.enumgame;

public class Orc extends Basic {

    public Orc(String name) {

    }

    @Override
    public Type getType() {
        return Type.ORC;
    }

    @Override
    public int getDamage() {
        return Type.ORC.getDamage()+super.getDamage();
    }

    @Override
    public int getSpeed() {
        return Type.ORC.getSpeed()+super.getSpeed();
    }

    @Override
    public int getHealthPoint() {
        return Type.ORC.getHealthPoint()+super.getHealthPoint();
    }

    @Override
    public int getArmor() {
        return Type.ORC.getArmor()+super.getArmor();
    }
}
