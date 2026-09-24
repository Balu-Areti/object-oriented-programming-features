package com.java.oop.collection;

import java.util.*;

public class CustomerMap {
    static void main() {
        Customer customer1 = new Customer();
        customer1.setId(111);
        customer1.setName("John");
        customer1.setEmail("customer1@gmail.com");
        customer1.setPhone("91235891");
        customer1.setMembership("Gold");
        System.out.println(customer1);


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
        System.out.println(customer4);

        Customer customer5 = new Customer();
        customer5.setId(111);
        customer5.setName("John");
        customer5.setEmail("customer1@gmail.com");
        customer5.setPhone("91235891");
        customer5.setMembership("Silver");
        System.out.println(customer5);

        HashMap<Integer, Customer> customerHashMap = new HashMap<>();
        customerHashMap.put(customer1.getId(), customer1);
        customerHashMap.put(customer2.getId(), customer2);
        customerHashMap.put(customer3.getId(), customer3);
        customerHashMap.put(customer4.getId(), customer4);
        customerHashMap.put(customer5.getId(), customer5);
        System.out.println(customerHashMap);

        System.out.println(customerHashMap.get(customer1.getId()));
        System.out.println(customerHashMap.get(111));//Key value Object Map to find that particular element

//------------------------------

        HashMap<String, List<Customer>> customerMembershipMap = new HashMap<>();
        //CustomerService Logic
        List<Customer> allCustomers = new ArrayList<>();
        allCustomers.add(customer1);
        allCustomers.add(customer2);
        allCustomers.add(customer3);
        allCustomers.add(customer4);
        allCustomers.add(customer5);

        // 2. call Service class
        CustomerService service = new CustomerService();


        //3.We give that mixed list to Sevice it give us to Map
        Map<String, List<Customer>> finalMap = service.getCustomerMembershipMap(allCustomers);

       // 4. Print
        System.out.println("--- GOLD CUSTOMERS ---");
        System.out.println(finalMap.get("Gold"));

        System.out.println("--- SILVER CUSTOMERS ---");
        System.out.println(finalMap.get("Silver"));

        System.out.println("--- Bronze CUSTOMERS ---");
        System.out.println(finalMap.get("Bronze"));
    }
}
