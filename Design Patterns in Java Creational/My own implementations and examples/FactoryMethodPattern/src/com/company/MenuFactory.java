package com.company;

public class MenuFactory {

    public static Menu getMenu(MenuType menuType){
        switch (menuType){
            case all:{
                return new all();
            }
            case Vegan:{
                return new Vegan();
            }
            case Vegetarian:{
                return new Vegetarian();
            }
            default:{
                return null;
            }
        }
    }
}
