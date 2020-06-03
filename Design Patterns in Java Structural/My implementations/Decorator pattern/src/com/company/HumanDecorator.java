package com.company;

public abstract class HumanDecorator implements Human {

    public Human human;

    public HumanDecorator(Human human) {
        this.human = human;
    }

    @Override
    public String speak() {
        return this.human.speak();
    }
}
