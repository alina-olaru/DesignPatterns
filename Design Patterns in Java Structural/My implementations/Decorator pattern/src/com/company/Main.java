package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Human human = new EngineerDecorator(new CookerDecorator(new TeacherDecorator(new BasicHuman())));
        Human human1=new CookerDecorator(new BasicHuman());
        System.out.println(human1.speak());
        System.out.println(human.speak());
    }
}
