package com.java.oop.collection;

import java.util.Comparator;

public class IdComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getId() - o2.getId();
    }
}
