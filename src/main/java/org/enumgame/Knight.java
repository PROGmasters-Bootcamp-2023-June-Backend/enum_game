package org.enumgame;

public class Knight extends Character {
    private final Type type = Type.KNIGHT;
    public Knight(String name) {
        super(name, Type.KNIGHT);
    }
    public Type getType() {
        return type;
    }
}
