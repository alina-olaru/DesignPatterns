package com.company;

public class AbstractColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String animalType) {
        if("ROZ".toLowerCase().equals(animalType.toLowerCase())){
            return new Roz();
        }
        else{
            return null;
        }
    }
}
