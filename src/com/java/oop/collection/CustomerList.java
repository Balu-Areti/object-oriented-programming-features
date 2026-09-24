package com.java.oop.collection;

import java.util.*;

public class CustomerList {
    static void main() {
        Customer customer1 = new Customer();
        customer1.setId(111);
        customer1.setName("John");
        customer1.setEmail("customer1@gmail.com");
        customer1.setMembership("Gold");
        customer1.setPhone("91235891");


        Customer customer2 = new Customer();
        customer2.setId(2222);
        customer2.setName("John1");
        customer2.setEmail("customer2@gmail.com");
        customer2.setPhone("9123589122");
        customer2.setMembership("Silver");
        System.out.println(customer2);

        Customer customer3 = new Customer();
        customer3.setId(3333);
        customer3.setName("John3");
        customer3.setEmail("customer2@gmail.com");
        customer3.setPhone("9123589122");
        customer3.setMembership("Bronze");
        System.out.println(customer3);

        Customer customer4 = new Customer();
        customer4.setId(44444);
        customer4.setName("John4");
        customer4.setEmail("customer4@gmail.com");
        customer4.setPhone("9123589122");
        customer4.setMembership("Gold");
        System.out.println(customer2);

        Customer customer5 = new Customer();
        customer5.setId(111);
        customer5.setName("John");
        customer5.setEmail("customer1@gmail.com");
        customer5.setPhone("91235891");
        customer5.setMembership("Silver");
        System.out.println(customer5);

        //ArrayList  access
        //LinkedList  manipulation udate deletion
        //ArrayList<Customer> customerArrayList = new ArrayList<>();
        LinkedList<Customer> customerArrayList = new LinkedList<>();
        customerArrayList.add(customer1);
        customerArrayList.add(customer2);
        customerArrayList.add(customer3);
        customerArrayList.add(customer4);
        customerArrayList.add(customer5);
        System.out.println(customerArrayList.size());
        System.out.println(customerArrayList.get(2));


        //System.out.println(customerSet);

        // For-each
        for (Customer customer : customerArrayList) {
            System.out.println(customer);
        }
        customerArrayList.remove(customer3);
        customerArrayList.add(3, new Customer());
        System.out.println(customerArrayList);


        //index based access
        for (int i = 0; i < customerArrayList.size(); i++) {
            System.out.println(customerArrayList.get(i));
        }

    }
}
