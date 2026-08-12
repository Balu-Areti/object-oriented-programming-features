package com.java.oop.businessusecase.ecommercepayment;

import java.math.BigDecimal;

// RUNTIME POLYMORPHISM
public class PaymentGatewayService {
    // RUNTIME POLYMORPHISM
    public void executePayment(Payment payment){
        System.out.println("====== INITIATING PAYMENT ======");
        payment.processPayment(); // MAGIC HAPPENS HERE
        payment.displayTransactionDetails();

    }
    // METHOD OVERLOADING
    public void processRefund(Payment payment){
        System.out.println("full refund of : " + payment.getAmount());
        System.out.println("Transaction id : " + payment.getTransactionId());
        System.out.println( "Refund will be credited to Customer: "+ payment.getCustomer().getCustomerName() + "\n");


    }

    // Method 2: Partial Refund (Requires Payment object + partialAmount)
    public void processRefund(Payment payment, BigDecimal partialAmount){
        System.out.println("Initiating PARTIAL REFUND of ₹" + partialAmount +" for TXN: " + payment.getTransactionId());
        System.out.println("Partial refund will be credited to Customer: " +payment.getCustomer().getCustomerName() + "\n");

    }






}
