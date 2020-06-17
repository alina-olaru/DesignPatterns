package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class titles implements Iterable<String>{



    private String[] title;
    private Integer index;

    public titles(){
        title = new String[3];
        index=0;

    }


    public void add(String newTitle) {
        if(index == title.length) {
            String [] largerBikes = new String[title.length + 5];
            System.arraycopy( title, 0, largerBikes, 0, title.length );
            title = largerBikes;
            largerBikes = null;
        }

        title[index] = newTitle;
        index++;
    }


    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < title.length && title[currentIndex] != null;
            }

            @Override
            public String next() {
                return title[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        };

        return it;
    }

    @Override
    public String toString() {
        return "titles{" +
                "title=" + Arrays.toString(title) +
                ", index=" + index +
                '}';
    }
}
