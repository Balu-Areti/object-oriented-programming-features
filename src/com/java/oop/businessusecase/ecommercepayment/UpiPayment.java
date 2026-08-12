package com.java.oop.businessusecase.ecommercepayment;

import java.math.BigDecimal;
import java.time.LocalDate;

//IS-A relation to Payment
public class UpiPayment extends Payment {
    private String upiId;
    private String linkedBank;

    public UpiPayment(String transactionId, Customer customer, BigDecimal amount, LocalDate paymentDate, String status, String upiId, String linkedBank) {
        super(transactionId, customer, amount, paymentDate, status);
        this.upiId = upiId;
        this.linkedBank = linkedBank;
    }

    // OVERRIDING: Adding UPI specific details to the display
    @Override
    public void displayTransactionDetails(){
        super.displayTransactionDetails(); //Base Class first
        System.out.println("Payment Mode   : UPI (" + upiId + " - " + linkedBank + ")");
    }

    // OVERRIDING: Providing the body for the Abstract method
    @Override
    public void processPayment(){
        System.out.println("Connecting to UPI Network...");
        System.out.println("Verifying VPA: " + upiId + " with " + linkedBank);
        System.out.println("UPI Payment Successful");

        // PROPER ENCAPSULATION: We cannot do this.status = "SUCCESS", so we use setter!
        setStatus("SUCCESS");
    }
}
