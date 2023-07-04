package org.enumgame;

public class Assassin extends Character{
    public Assassin(String name) {
        super(name);
        setDamage(getDamage() + Type.ASSASSIN.getDamage());
        setSpeed(getSpeed() + Type.ASSASSIN.getSpeed());
        setHealthPoint(getHealthPoint() + Type.ASSASSIN.getHealthpoints());
        setArmor(getArmor() + Type.ASSASSIN.getArmor());
        setType(getType() + Type.ASSASSIN.getType());

    }
}
