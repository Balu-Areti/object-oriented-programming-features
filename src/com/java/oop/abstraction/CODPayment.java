package com.java.oop.abstraction;

public class CODPayment extends Payment {
    int deliveryFee;

    public CODPayment(int id, int customerId, int amount, int deliveryFee) {
        super(id, customerId, amount);
        this.deliveryFee = deliveryFee;
    }

    public void pay(){
        super.pay();
        System.out.println("Payment Mode is COD");
        System.out.println("Delivery Fee :" + deliveryFee);
    }
}
