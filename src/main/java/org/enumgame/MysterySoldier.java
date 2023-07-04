package org.enumgame;

import java.util.Random;

public class MysterySoldier extends Character {
    public MysterySoldier(String name) {
        super(name);
        Random random = new Random();
        int typeSelect = random.nextInt(4);
        switch (typeSelect){
            case 0:
                this.damage += 10;
                this.speed -= 5;
                this.healthPoint += 10;
                this.armor += 5;
                this.type = Type.ORC;
                break;
            case 1:
                this.damage += 5;
                this.speed += 20;
                this.healthPoint -= 5;
                this.armor += 20;
                this.type = Type.KNIGHT;
                break;
            case 2:
                this.damage -= 5;
                this.speed += 0;
                this.healthPoint += 5;
                this.armor += 0;
                this.type = Type.WIZARD;
                break;
            case 3:
                this.damage += 15;
                this.speed += 10;
                this.healthPoint -= 5;
                this.armor += 0;
                this.type = Type.ASSASSIN;
        }
    }

}
