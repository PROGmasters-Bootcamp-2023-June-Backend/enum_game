package org.enumgame;

public class Orc extends Character {
    private Type type = Type.ORC;

    public Orc(String name) {
        super(name, Type.ORC);

    }
    public Type getType() {
        return type;
    }
}
