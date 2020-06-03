package com.company;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private static Integer nr=0;
    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

    void takeOrder(String itemName, int orderNumber) {
        //we're not creating am item foreach order
        //we use the lookup method that checks in
        //the hashmap if the item is already in pool
        //if there is memory already allocated , we
        //use that item ,if not
        //we create the item (we alloc memory)
        //    Item item = new Item(itemName);
        //with upper choice , there would be 12 object made  because
        //foreach new order , a new item would be created , no metter
        //if there is already memory alocated for an object like this.
        //with flyweigh Design Pattern we use the object that exists(if there is one)
        Item item = catalog.lookup(itemName);

        this.nr++;
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    String report() {
        return "\nTotal Item objects made: "
                + catalog.totalItemsMade();

//        return "\nTotal Item objects made: "
//                + nr;
    }
}