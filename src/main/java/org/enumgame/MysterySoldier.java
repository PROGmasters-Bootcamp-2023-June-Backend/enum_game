package org.enumgame;


import java.util.Random;

public class MysterySoldier extends Basic {

    public MysterySoldier(String name) {

    }

    @Override
    public Type getType() {
        Random random = new Random();
        int n = random.nextInt(4);
        if (n == 0) {
            return Type.ASSASSIN;
        } else if (n == 1) {
            return Type.KNIGHT;
        } else if (n==2) {
            return Type.WIZARD;
        }else {
            return Type.ORC;
        }
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public int getHealthPoint() {
        return super.getHealthPoint();
    }

    @Override
    public int getArmor() {
        return super.getArmor();
    }
}
