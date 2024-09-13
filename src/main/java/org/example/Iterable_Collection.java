package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable_Collection {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        //USING ITERATOR METHOD
        System.out.println("Iterating the values using iterator method");

        Iterator<Integer> valuesIterator = values.iterator();
        while (valuesIterator.hasNext()){
            int val = valuesIterator.next();
            System.out.println(val);
            if (val == 3){
                valuesIterator.remove();
            }

        }

        System.out.println("Iterating th values for each loop");

        for (int val : values){
            System.out.println(val);
        }

        System.out.println("Testing forEach Method");


        values.forEach(System.out::println);
    }
}
