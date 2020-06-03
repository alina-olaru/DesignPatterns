package com.company;

public class MixIngredients implements Cookie {
    AddIngredient butter;
    AddIngredient chocolate;
    public MixIngredients(){
        this.butter=new AddButter();
        this.chocolate = new AddChocolate();
    }

    @Override
    public void cook() {
       // System.out.println("Mixing butter , sugar , bananas and chocolate");
        butter.AddIngredient();
        chocolate.AddIngredient();
    }
}
