package org.enumgame;

public class Orc extends Character{
    public Orc(String name) {
        super(name);
        setDamage(getDamage() + Type.ORC.getDamage());
        setSpeed(getSpeed() + Type.ORC.getSpeed());
        setHealthPoint(getHealthPoint() + Type.ORC.getHealthpoints());
        setArmor(getArmor() + Type.ORC.getArmor());
        setType(getType() + Type.ORC.getType());
    }
}
