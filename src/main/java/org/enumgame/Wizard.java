package org.enumgame;

public class Wizard extends Character{
    public Wizard(String name) {

        super(name);
        this.damage -= 5;
        this.speed += 0;
        this.healthPoint += 5;
        this.armor += 0;
        this.type = Type.WIZARD;
    }
}
