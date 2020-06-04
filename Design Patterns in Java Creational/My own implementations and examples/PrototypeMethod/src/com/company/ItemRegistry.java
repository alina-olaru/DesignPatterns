package com.company;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private Map<String,Item> items=new HashMap<String, Item>();
    public ItemRegistry(){
        loadAllItems();
    }

    private void loadAllItems(){
        /**
         * default values for items (same as they would be in a constructor
         */
        Book book = new Book();
        book.setNumberOfPages(156);
        book.setItemTtitle("P.S.I love you");
        book.setPrice(20.0);
        book.setStoc(244);
        items.put("Book",book);

        Movie movie = new Movie();
        movie.setDuration("2h30");
        movie.setItemTtitle("Hunger games");
        movie.setPrice(59.0);
        movie.setStoc(24);
        items.put("Movie",movie);



        Cookies cookie = new Cookies();
        cookie.setItemTtitle("Coconut cake");
        cookie.setPrice(15.0);
        cookie.setStoc(24000);
        items.put("Cookies",cookie);

    }

    public Item createItem(String type){
        /**
         * type = one of movie,book,cookies
         */

        Item item = null;
        try{
            item=(Item)(items.get(type).clone());
        }catch (CloneNotSupportedException rc){
            rc.getStackTrace();
        }catch (NullPointerException ex){
            System.out.println(ex.getCause());
        }

        return item;
    }
}
