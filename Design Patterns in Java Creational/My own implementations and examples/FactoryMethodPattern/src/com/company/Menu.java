package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {
    protected List<FoodItem> menuItems = new ArrayList<>();

    public Menu(){
        this.createMenu();
    }

    public List<FoodItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<FoodItem> menuItems) {
        this.menuItems = menuItems;
    }

    public abstract void createMenu();

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}
