package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here


        titles t = new titles();
        t.add("P.S.Te iubesc");
        t.add("Intalnire cu viata");
        t.add("11 minute");

        Iterator<String> iterator = t.iterator();
        for(String title : t){
            System.out.println(title);
        }

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
