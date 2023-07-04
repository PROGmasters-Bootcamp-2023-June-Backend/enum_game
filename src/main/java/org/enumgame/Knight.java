package org.enumgame;

public class Knight extends Character {
    public Knight(String name) {

        super(name);
        this.damage += 5;
        this.speed += 20;
        this.healthPoint -= 5;
        this.armor += 20;
        this.type = Type.KNIGHT;


    }
}
