package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu=MenuFactory.getMenu(MenuType.all);
        Menu menu1=MenuFactory.getMenu(MenuType.Vegan);
        System.out.println(menu.getMenuItems());
        System.out.println(menu1.getMenuItems());


    }
}
