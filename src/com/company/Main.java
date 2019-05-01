package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        comparatorAndComparable();
    }

    public static void comparatorAndComparable(){

        Dog d1 = new Dog("Bob", 20);
        Dog d2 = new Dog("Tom", 20);
        Dog d3 = new Dog("John",33);
        Dog d4 = new Dog("Evan",10);

        System.out.println(d1.compareTo(d2));
        System.out.println(d2.compareTo(d3));
        System.out.println(d3.compareTo(d1));

        List<Dog> myDogs = new ArrayList<>();
        myDogs.add(d1);
        myDogs.add(d2);
        myDogs.add(d3);
        myDogs.add(d4);

        System.out.println(myDogs);

        PriceComparator p = new PriceComparator();
        myDogs.sort(p);

        System.out.println(myDogs);
    }
}
