package com.java.oop.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ProductLinkedHashSet {
    static void main() {
        Product product1 = new Product();
        product1.setId(1).setName("Laptop").setPrice(20000);
        System.out.println(product1);

        Product product2 = new Product();
        product2.setId(2).setName("Mobile").setPrice(30000);
        System.out.println(product2);

        Product product3 = new Product();
        product3.setId(3).setName("Tablet").setPrice(40000);
        System.out.println(product3);

        Product product4 = new Product();
        product4.setId(4).setName("Tablet").setPrice(50000);
        System.out.println(product4);

        Product product5 = new Product();
        product5.setId(1).setName("Laptop").setPrice(20000);
        System.out.println(product5);

        LinkedHashSet<Product> productSet = new LinkedHashSet<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);
        productSet.add(product5);
        System.out.println(productSet);
        //System.out.println(productSet.size());

        Iterator<Product> productIterator = productSet.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println("-------------------------------");
            System.out.println("Id: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("-------------------------------");

        }

    }
}
