package com.java.oop.abstraction;

public class UpiPayment extends Payment{
    String upiId;

    public UpiPayment(int id, int customerId, int amount, String upiId) {
        super(id, customerId, amount);
        this.upiId = upiId;
    }
    @Override
    public void pay() {
        super.pay();
        System.out.println("UPI  Payment");
        System.out.println("UpiPayment Payment ID : " + upiId);
    }
}
