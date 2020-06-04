package com.company;

public interface AbstractFactory<T> {
    T create(String animalType);
}
