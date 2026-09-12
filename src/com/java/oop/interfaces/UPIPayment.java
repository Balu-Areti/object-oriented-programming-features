package com.java.oop.interfaces;

public class UPIPayment implements Payment {
    int id;
    int customerId;
    int amount;
    String upiId;

    public UPIPayment(int id, int customerId, int amount, String upiId) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Payment Made");
        System.out.println("Payment ID: "+ id);
        System.out.println("Customer ID: "+ customerId);
        System.out.println("Amount: "+ amount);
        System.out.println("UPI  Payment");
        System.out.println("UpiPayment Payment ID : " + upiId);
    }
}
