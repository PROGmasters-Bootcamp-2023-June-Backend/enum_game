package org.enumgame;

public class Orc extends basicCharacter{
    public static void main(String[] args) {
        Orc orc = new Orc("Janos");
        System.out.println(orc.getClass());
    }

    public Orc(String name) {
        super(name);
        setArmor(getArmor()+ Type.ORC.getArmor());
        setDamage(getDamage() + Type.ORC.getDamage());
        setHealthPoint(getHealthPoint() + Type.ORC.getHealtPoints());
        setSpeed(getSpeed() + Type.ORC.getSpeed());
        setCharacters(Type.ORC);
    }


}
