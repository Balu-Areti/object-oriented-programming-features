package com.java.oop.interfaces;

public class CODPayment implements Payment {
    // we are using Interface so implementation otherwisse class for Extend
    int id;
    int customerId;
    int amount;
    int deliveryFee;
    public void pay(){
        System.out.println("Payment Made COD");
        System.out.println("Payment ID: "+ id);
        System.out.println("Customer ID: "+ customerId);
        System.out.println("Amount: "+ amount);
        System.out.println("Delivery Fee :" + deliveryFee);
    }
}
