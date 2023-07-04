package org.enumgame;

public class Orc extends Character {

    private int damage = 10;

    public Orc(String name) {
        super(name);
        setDamage(getDamage()+Type.ORC.getDamage());
        setDamage(getDamage()+damage);
        setSpeed(getSpeed()+Type.ORC.getSpeed());
        setHealthPoint(getHealthPoint()+Type.ORC.getHealtpoints());
        setArmor(getArmor()+Type.ORC.getArmor());
        setType(Type.ORC.getType());

    }



}
