package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FactoryProvider provider = new FactoryProvider();
       AbstractFactory<Animal> animal= FactoryProvider.getFactory("Animal");
        AbstractFactory<Color> col= FactoryProvider.getFactory("Color");
       Dog d= (Dog)animal.create("Dog");
        System.out.println(d);
      Roz r=(Roz)col.create("roz");
        System.out.println(r);



    }
}
