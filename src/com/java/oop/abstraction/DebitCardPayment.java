package com.java.oop.abstraction;

public class DebitCardPayment extends Payment{
    String cardNumber;
    int discountAmount;

    public DebitCardPayment(int id, int customerId, int amount, String cardNumber, int discountAmount) {
        super(id, customerId, amount);
        this.cardNumber = cardNumber;
        this.discountAmount = discountAmount;
    }
    @Override
    public void pay() {
        super.pay();
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Discount Amount : " + discountAmount);
    }
}
