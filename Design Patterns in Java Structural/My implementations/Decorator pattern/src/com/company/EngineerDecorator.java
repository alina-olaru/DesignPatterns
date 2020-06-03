package com.company;

public  class EngineerDecorator extends HumanDecorator {
    public EngineerDecorator(Human human) {
        super(human);
    }

    @Override
    public String speak() {
        return human.speak() + addCodeAbility();
    }

    private String addCodeAbility(){
        return " I am an engineer";
    }
}
