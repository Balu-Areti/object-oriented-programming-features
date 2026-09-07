package com.java.oop.abstraction;

public class CreditCardPayment extends Payment{
    String cardNumber;
    String cardHolderName;
    String cardExpiration;

    public CreditCardPayment(int id, int customerId, int amount, String cardNumber, String cardHolderName, String cardExpiration) {
        super(id, customerId, amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardExpiration = cardExpiration;
    }


    public void pay() {
        super.pay();
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Card Expiration: " + cardExpiration);
    }
}
