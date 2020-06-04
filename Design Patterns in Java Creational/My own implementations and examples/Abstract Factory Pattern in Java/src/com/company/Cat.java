package com.company;

public class Cat implements Animal {
    @Override
    public String getAnimal() {
        return "Cat";
    }

    @Override
    public String getSpecificSound() {
        return "miau miau";
    }
}
