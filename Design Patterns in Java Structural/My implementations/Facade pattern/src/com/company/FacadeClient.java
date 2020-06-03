package com.company;

public class FacadeClient {
    public static void main(String[] args) {
        CookieMaker coconutCake = new CookieMaker();
        coconutCake.PrepareIngredients();
        coconutCake.MixIngredients();
        coconutCake.Heating();
        coconutCake.Cut();
    }
}
