package com.java.oop.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class CustomerTreeSet {
    static void main() {
        Customer customer1 = new Customer();
        customer1.setId(111);
        customer1.setName("John");
        customer1.setEmail("customer1@gmail.com");
        customer1.setPhone("91235891");


        Customer customer2 = new Customer();
        customer2.setId(2222);
        customer2.setName("John1");
        customer2.setEmail("customer2@gmail.com");
        customer2.setPhone("9123589122");
        System.out.println(customer2);

        Customer customer3 = new Customer();
        customer3.setId(3333);
        customer3.setName("John3");
        customer3.setEmail("customer2@gmail.com");
        customer3.setPhone("9123589122");
        System.out.println(customer3);

        Customer customer4 = new Customer();
        customer4.setId(44444);
        customer4.setName("John4");
        customer4.setEmail("customer4@gmail.com");
        customer4.setPhone("9123589122");
        System.out.println(customer4);

        Customer customer5 = new Customer();
        customer5.setId(111);
        customer5.setName("John");
        customer5.setEmail("customer1@gmail.com");
        customer5.setPhone("91235891");
        System.out.println(customer5);

        //TreeSet<Customer> customerSet = new TreeSet<>(new NameComparator());
        TreeSet<Customer> customerSet = new TreeSet<>(new IdComparator());
        customerSet.add(customer1);
        customerSet.add(customer2);
        customerSet.add(customer3);
        customerSet.add(customer4);
        customerSet.add(customer5);

        System.out.println(customerSet);

    }
}
