package org.enumgame;

public class Game {

    public static void main(String[] args)  {

        try {
            while (true) {
                Thread.sleep(1000);
                MysterySoldier mysterySoldier = new MysterySoldier("Mysterio");
                System.out.println("Mysterio values: ");
                System.out.println("org.enumgame.Type: " + mysterySoldier.getType());
                System.out.println("Damage: " + mysterySoldier.getDamage());
                System.out.println("HP: " + mysterySoldier.getHealthPoint());
                System.out.println("Speed: " + mysterySoldier.getSpeed());
                System.out.println("Armor: " + mysterySoldier.getArmor());
            }
        } catch (InterruptedException e) {
            System.out.println("Megkotlott :((((");
        }

    }

}
