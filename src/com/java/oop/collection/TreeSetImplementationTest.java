package com.java.oop.collection;

import java.util.TreeSet;

public class TreeSetImplementationTest {
    static void main() {
        TreeSet<Integer> idSet = new TreeSet<>();
        idSet.add(111);
        idSet.add(333);
        idSet.add(222);
        idSet.add(111);
        idSet.add(444);
        idSet.add(555);
        System.out.println(idSet);

        TreeSet<String> emailSet = new TreeSet<>();
        emailSet.add("customer1@gmail.com");
        emailSet.add("customer2@gmail.com");
        emailSet.add("customer3@gmail.com");
        emailSet.add("balu1@gmail.com");
        emailSet.add("madhu1@gmail.com");
        emailSet.add("customer1@gmail.com");
        System.out.println(emailSet);
    }
}
