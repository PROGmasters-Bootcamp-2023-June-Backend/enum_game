package org.enumgame;

public class Game {

    public static void main(String[] args)  {

        try {
            while (true) {
                Thread.sleep(1000);
                MysterySoldier mysterySoldier = new MysterySoldier("Mysterio");
                System.out.println("Mysterio values: ");
                System.out.println("Type: " + mysterySoldier.getType());
                System.out.println("Damage: " +(mysterySoldier.getDamage()+ ( Type.valueOf(mysterySoldier.getType().toString()).getDamage())));
                System.out.println("HP: " + (mysterySoldier.getHealthPoint()+Type.valueOf(mysterySoldier.getType().toString()).getHealthPoint()));
                System.out.println("Speed: " + (mysterySoldier.getSpeed()+Type.valueOf(mysterySoldier.getType().toString()).getSpeed()));
                System.out.println("Armor: " + (mysterySoldier.getArmor()+Type.valueOf(mysterySoldier.getType().toString()).getArmor()));
            }
        } catch (InterruptedException e) {
            System.out.println("Megkotlott :((((");
        }

    }

}
