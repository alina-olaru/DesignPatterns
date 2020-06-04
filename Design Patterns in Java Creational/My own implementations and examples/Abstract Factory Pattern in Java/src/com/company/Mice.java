package com.company;

public class Mice implements Animal {
    @Override
    public String getAnimal() {
        return "Mice";
    }

    @Override
    public String getSpecificSound() {
        return "chit chit";
    }
}
