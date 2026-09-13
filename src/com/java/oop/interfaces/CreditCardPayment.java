package com.java.oop.interfaces;

public class CreditCardPayment implements Payment,Refund{
    //Code dubplicates
    int id;
    int customerId;
    int amount;
    int cardNumber;
    String cardHolderName;
    String cardExpiration;

    public CreditCardPayment(int id, int customerId, int amount, int cardNumber, String cardHolderName, String cardExpiration) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardExpiration = cardExpiration;
    }

    @Override
    public void pay() {
        System.out.println("Payment Made");
        System.out.println("Payment ID: "+ id);
        System.out.println("Customer ID: "+ customerId);
        System.out.println("Amount: "+ amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Card Expiration: " + cardExpiration);
    }

    @Override
    public void refundable() {
        System.out.println("CrediCard REfund : Processing Payment 1000");
    }
}
