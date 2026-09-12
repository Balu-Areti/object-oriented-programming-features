package com.java.oop.interfaces;

public class CreditCardPayment implements Payment {
    //Code dubplicates
    int id;
    int customerId;
    int amount;
    int cardNumber;
    String cardHolderName;
    String cardExpiration;
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
}
