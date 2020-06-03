package com.company;

public class CookerDecorator extends HumanDecorator{

    public CookerDecorator(Human human) {
        super(human);
    }

    @Override
    public String speak() {
        return human.speak() + addCookAbility();
    }

    private String addCookAbility(){
        return " I am a cooker";
    }
}
