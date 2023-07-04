package org.enumgame;

public class Wizard extends Character {

    private Type type = Type.WIZARD;

    public Wizard(String name) {
        super(name, Type.WIZARD);
    }

    public Type getType() {
        return type;
    }
}
