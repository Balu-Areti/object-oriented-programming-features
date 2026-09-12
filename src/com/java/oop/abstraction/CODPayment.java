package com.java.oop.abstraction;

public class CODPayment extends Payment {
    int deliveryFee;

    public CODPayment(int id, int customerId, int amount, int deliveryFee) {
        super(id, customerId, amount);
        this.deliveryFee = deliveryFee;
    }

    public void pay(){
        System.out.println("Payment Made");
        System.out.println("Payment ID: "+ id);
        System.out.println("Customer ID: "+ customerId);
        System.out.println("Amount: "+ amount);
        System.out.println("Payment Mode is COD");
        System.out.println("Delivery Fee :" + deliveryFee);
    }
}
