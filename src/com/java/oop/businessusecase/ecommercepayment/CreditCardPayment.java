package com.java.oop.businessusecase.ecommercepayment;

import java.math.BigDecimal;
import java.time.LocalDate;

// INHERITANCE: CreditCardPayment IS-A Payment
public class CreditCardPayment extends Payment{
    private String maskedCardNumber;
    private String cardProvider;
    private int rewardPoints;


    public CreditCardPayment(String transactionId, Customer customer, BigDecimal amount, LocalDate paymentDate, String status, String maskedCardNumber, String cardProvider, int rewardPoints) {
        super(transactionId, customer, amount, paymentDate, status);
        this.maskedCardNumber = maskedCardNumber;
        this.cardProvider = cardProvider;
        this.rewardPoints = rewardPoints;
    }

    @Override
    public void displayTransactionDetails() {
        super.displayTransactionDetails();
        System.out.println("Payment Mode   : Credit Card (" + cardProvider + " | " + maskedCardNumber + ")");
        System.out.println("Reward Points  : " + rewardPoints + " points earned");
    }

    @Override
    public void processPayment() {
        System.out.println("Connecting to " + cardProvider + " Gateway...");
        System.out.println("Requesting OTP for Card: " + maskedCardNumber);
        System.out.println("Credit Card Payment Successful");

        setStatus("SUCCESS");
    }

}
