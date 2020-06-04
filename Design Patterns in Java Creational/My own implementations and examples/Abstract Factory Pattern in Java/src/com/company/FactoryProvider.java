package com.company;

public class FactoryProvider {

    public static AbstractFactory getFactory(String FactoryType){
        if("Animal".toLowerCase().equals(FactoryType.toLowerCase())){
            return new AbstractAnimalFactory();
        }
        if("Color".toLowerCase().equals(FactoryType.toLowerCase())){
            return new AbstractColorFactory();
        }
        else{
            return null;
        }
    }
}
