package com.company;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String getSpecificSound() {
        return "ham ham ham";
    }
}
