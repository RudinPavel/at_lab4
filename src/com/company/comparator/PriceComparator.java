package com.company.comparator;

import com.company.comparator.Dog;

import java.util.Comparator;

public class PriceComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getPrice() == o2.getPrice())
            return 0;
        if (o1.getPrice() > o2.getPrice())
            return 1;
        return -1;
    }
}
