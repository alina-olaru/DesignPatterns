package com.company;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    //all the products
    private Map<String, Item> items = new HashMap<String, Item>();

    //factory method
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName))
            //if not exists ->we insert it
            items.put(itemName, new Item(itemName));
        //return the item (existing or created
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}