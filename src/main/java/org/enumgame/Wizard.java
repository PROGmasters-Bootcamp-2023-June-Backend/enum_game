package org.enumgame;

public class Wizard extends Character{
    public Wizard(String name) {
        super(name);
        setDamage(getDamage() + Type.WIZARD.getDamage());
        setSpeed(getSpeed() + Type.WIZARD.getSpeed());
        setHealthPoint(getHealthPoint() + Type.WIZARD.getHealthpoints());
        setArmor(getArmor() + Type.WIZARD.getArmor());
        setType(Type.WIZARD.getType());
    }
}
