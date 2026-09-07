package com.java.oop.abstraction;

public class Payment {
    int id;
    int customerId;
    int amount;

    public Payment(int id, int customerId, int amount) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
    }
    public void pay(){
        System.out.println("Payment Made");
        System.out.println("Payment ID: "+ id);
        System.out.println("Customer ID: "+ customerId);
        System.out.println("Amount: "+ amount);
    }
}
