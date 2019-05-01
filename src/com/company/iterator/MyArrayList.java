package com.company.iterator;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

    private final int currentCapacity = 100;
    private int pointer = 0;
    private Object[] values = new Object[currentCapacity];
    // private T[] values = new T[0]; // НЕЛЬЗЯ! Почему?

    public boolean add(T element) {
        values[pointer++] = element;
        return true;
    }

    public T get(int index) {
        return (T) values[index];
    }

    public int size() {
        return pointer;
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < pointer && values[currentIndex] != null;
            }

            @Override
            public T next() {
                return (T) values[currentIndex++];
            }

            @Override
            public void remove(){
                throw new UnsupportedOperationException("remove");
            }
        };
    }
}