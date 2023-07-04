package org.enumgame;

public class Knight extends Basic {
    public Knight(String name) {

    }

    @Override
    public Type getType() {
        return Type.KNIGHT;
    }

    @Override
    public int getDamage() {
        return Type.KNIGHT.getDamage()+super.getDamage();
    }

    @Override
    public int getSpeed() {
        return Type.KNIGHT.getSpeed()+super.getSpeed();
    }

    @Override
    public int getHealthPoint() {
        return Type.KNIGHT.getHealthPoint()+super.getHealthPoint();
    }

    @Override
    public int getArmor() {
        return Type.KNIGHT.getArmor()+super.getArmor();
    }
}
