package edu.txstate.sl20;

public class Instructor extends Person implements Sound{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String welcome() {
        return "Hi, I am " + title + " " + getName() + ".";
    }
}
