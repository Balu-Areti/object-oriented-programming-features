package com.java.oop.interfaces;

public class DebitCardPayment implements Payment, Refund{
    int id;
    int customerId;
    int amount;
    int cardNumber;
    int discountAmount;

    public DebitCardPayment(int id, int customerId, int amount, int cardNumber, int discountAmount) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.discountAmount = discountAmount;
    }

    @Override
    public void pay() {
        System.out.println("Payment Made");
        System.out.println("Payment ID: "+ id);
        System.out.println("Customer ID: "+ customerId);
        System.out.println("Amount: "+ amount);
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Discount Amount : " + discountAmount);
    }
    @Override
    public void refundable() {
        System.out.println("CrediCard : Processing Payment 1000");
    }
}
