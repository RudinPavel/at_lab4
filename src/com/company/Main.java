package com.company;

import com.company.comparator.*;
import com.company.iterator.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        comparatorAndComparable();

        try {
            javaListIterator();
            myListIterator();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void myListIterator(){ //throws Exception{

        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(4);
        myArrayList.add(3f);
        myArrayList.add(new Dog ("Spotty", 20));
        myArrayList.add('d');
        myArrayList.add("hello");
        myArrayList.add(new Dog ("Peach", 100));

        System.out.println("Size = " + myArrayList.size());

        Iterator myIterator = myArrayList.iterator();
        while (myIterator.hasNext())
            System.out.println(myIterator.next());

        myIterator.remove();
    }

    public static void javaListIterator() throws NoSuchElementException {
        Dog d1 = new Dog("Bob", 20);
        Dog d2 = new Dog("Tom", 20);
        Dog d3 = new Dog("John",33);
        Dog d4 = new Dog("Evan",10);

        List<Dog> myDogs = new ArrayList<>();
        myDogs.add(d1);
        myDogs.add(d2);
        myDogs.add(d3);
        myDogs.add(d4);

        Iterator myIterator = myDogs.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
        // myIterator.next(); выдаёт ошибку, так как прошли до конца итератором
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
