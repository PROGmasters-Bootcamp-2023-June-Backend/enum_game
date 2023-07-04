package org.enumgame;

public class Assassin extends Character {
    public Assassin(String name) {

        super(name);
        this.damage += 15;
        this.speed += 10;
        this.healthPoint -= 5;
        this.armor += 0;
        this.type = Type.ASSASSIN;
    }
}
