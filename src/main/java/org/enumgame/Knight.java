package org.enumgame;

public class Knight extends Character{

    public Knight(String name) {
        super(name);
        setDamage(getDamage() + Type.KNIGHT.getDamage());
        setSpeed(getSpeed() + Type.KNIGHT.getSpeed());
        setHealthPoint(getHealthPoint() + Type.KNIGHT.getHealthpoints());
        setArmor(getArmor() + Type.KNIGHT.getArmor());
        setType(getType() + Type.KNIGHT.getType());
    }
}
