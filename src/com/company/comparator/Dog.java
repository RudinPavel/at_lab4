package com.company.comparator;

public class Dog implements Comparable<Dog> {

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Dog(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Dog(){
    }

    @Override
    public int compareTo(Dog o) {
        if (this.price == o.price)
            return 0;
        if (this.price > o.price)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
