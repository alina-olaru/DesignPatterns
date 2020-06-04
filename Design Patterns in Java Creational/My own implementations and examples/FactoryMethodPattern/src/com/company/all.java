package com.company;

public class all extends Menu {
    @Override
    public void createMenu() {
        menuItems.add(new AvocadoToast());
        menuItems.add(new BananaCookie());
        menuItems.add(new VeganPasta());
        menuItems.add(new Pizza());
        menuItems.add(new CarbonaraPasta());
        menuItems.add(new CesarSalad());
    }

    @Override
    public String toString() {
        return "all{" +
                "menuItems=" + menuItems +
                '}';
    }
}
