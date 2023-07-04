package org.enumgame;

public class Assassin extends Character{


    public Assassin(String name) {
        super(name);
        setDamage(getDamage()+Type.ASSASSIN.getDamage());
        setSpeed(getSpeed()+Type.ASSASSIN.getSpeed());
        setHealthPoint(getHealthPoint()+Type.ASSASSIN.getHealtpoints());
        setArmor(getArmor()+Type.ASSASSIN.getArmor());
        setType(Type.ASSASSIN.getType());

    }


}
