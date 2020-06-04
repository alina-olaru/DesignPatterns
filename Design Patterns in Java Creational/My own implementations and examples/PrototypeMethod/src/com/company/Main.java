package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ItemRegistry registry = new ItemRegistry();
        Movie myMovie=(Movie)registry.createItem("Movie");
        myMovie.setDuration("5h");
        myMovie.setPrice(1000.0);

        System.out.println(myMovie);

        Movie second=(Movie)registry.createItem("Movie");
        second.setItemTtitle("Miami Bici");


        System.out.println(second);
    }
}
