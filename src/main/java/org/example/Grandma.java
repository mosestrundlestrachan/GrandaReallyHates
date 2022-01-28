package org.example;

public abstract class Grandma {
    String name;

    public String getName() {
        return name;
    }

    public Grandma(String name) {
        this.name = name;
    }

    public abstract boolean likesWord(String str);


}
