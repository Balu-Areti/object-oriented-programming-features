package com.java.oop.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetImplementationTest {
    static void main() {
        HashSet<Integer> idSet = new HashSet<>();
        idSet.add(1);
        idSet.add(2);
        idSet.add(3);
        idSet.add(4);
        idSet.add(1);
        System.out.println(idSet);
        System.out.println(idSet.size());

        Iterator<Integer> iterator = idSet.iterator();
        while (iterator.hasNext()){
            int id = iterator.next();
            System.out.println(id);
        }

        HashSet<String> emailSet = new  HashSet<>();
        emailSet.add("customer1@gmail.com");
        emailSet.add("customer2@gmail.com");
        emailSet.add("customer3@gmail.com");
        System.out.println(emailSet);

        Iterator<String> emailIterator = emailSet.iterator();
        while (emailIterator.hasNext()){
            String email = emailIterator.next();
            System.out.println(email);
        }
    }
}
