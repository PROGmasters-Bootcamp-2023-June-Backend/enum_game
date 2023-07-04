package org.enumgame;

public class Assassin extends Character {
    private final Type type = Type.ASSASSIN;

    public Assassin(String name) {
        super(name, Type.ASSASSIN);
    }

    public Type getType() {
        return type;
    }
}
