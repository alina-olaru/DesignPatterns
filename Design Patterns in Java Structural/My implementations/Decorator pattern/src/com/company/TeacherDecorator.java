package com.company;

public class TeacherDecorator extends HumanDecorator {
    public TeacherDecorator(Human human) {
        super(human);
    }

    @Override
    public String speak() {
        return human.speak() + addTeachingAbility();
    }

    public String addTeachingAbility(){
        return " I am a teacher";
    }
}
