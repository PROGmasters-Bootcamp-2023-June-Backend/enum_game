package org.enumgame;

public class Wizard extends Basic {
    public Wizard(String name) {

    }

    @Override
    public Type getType() {
        return Type.WIZARD;
    }

    @Override
    public int getDamage() {
        return Type.WIZARD.getDamage()+super.getDamage();
    }

    @Override
    public int getSpeed() {
        return Type.WIZARD.getSpeed()+super.getSpeed();

    }

    @Override
    public int getHealthPoint() {
        return Type.WIZARD.getHealthPoint()+super.getHealthPoint();
    }

    @Override
    public int getArmor() {
        return Type.WIZARD.getArmor()+super.getArmor();
    }
}
