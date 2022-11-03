package edu.txstate.sl20;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String welcome(){return "Hi, my name is " + name;}
}
