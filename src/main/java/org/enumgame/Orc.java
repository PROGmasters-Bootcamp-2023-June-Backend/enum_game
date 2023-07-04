package org.enumgame;

public class Orc extends Character {
    public Orc(String name) {
        super(name);
        this.damage += 10;
        this.speed -= 5;
        this.healthPoint += 10;
        this.armor += 5;
        this.type = Type.ORC;
    }


}
