package com.company;

public class Vegetarian extends Menu {
    @Override
    public void createMenu() {
        menuItems.add(new AvocadoToast());
        menuItems.add(new BananaCookie());
        menuItems.add(new VeganPasta());
    }
}
