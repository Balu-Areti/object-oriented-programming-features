package com.java.oop.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {

    public Map<String, List<Customer>> getCustomerMembershipMap(List<Customer> customerList) {
        Map<String, List<Customer>> groupedMap = new HashMap<>();
        for (Customer customer : customerList) {
            String category = customer.getMembership();

            if (!groupedMap.containsKey(category)) {
                groupedMap.put(category, new ArrayList<>());
            }
            groupedMap.get(category).add(customer);
        }
        return groupedMap;
    }

}