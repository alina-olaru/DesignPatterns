package com.company;

public class AbstractAnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String animalType) {
        if("Dog".toLowerCase().equals(animalType.toLowerCase())){
            return new Dog();
        }
        if("Mice".toLowerCase().equals(animalType.toLowerCase())){
            return new Mice();
        }
        if("Cat".toLowerCase().equals(animalType.toLowerCase())){
            return new Cat();
        }
        else{
            return null;
        }
    }
}
