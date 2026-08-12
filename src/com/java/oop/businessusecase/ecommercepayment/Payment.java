package com.java.oop.businessusecase.ecommercepayment;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Payment {
    private String transactionId;
    private Customer customer;   // // COMPOSITION (HAS-A Relationship)
    private BigDecimal amount;
    private LocalDate PaymentDate;
    private String status;

    //// 2. CONSTRUCTORS empty
    public Payment(){
    }

    public Payment(String transactionId, Customer customer, BigDecimal amount, LocalDate paymentDate, String status) {
        this.transactionId = transactionId;
        this.customer = customer;
        // Calling Customer object's method!
//        if(customer != null) {
//            customer.displayCustomerDetails();
//        }
        this.amount = amount;
        PaymentDate = paymentDate;
        this.status = status;
    }

    //3 getters and setters

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        PaymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Common Business Logic METHOD (this Common logic shared by all)
    public void displayTransactionDetails(){
        System.out.println("--------------------");
        System.out.println("Transaction ID : " + transactionId);
        customer.displayCustomerDetails();// Prints the customer object's details!
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + PaymentDate);
        System.out.println("Status: " + status);
    }

    // 5. METHOD TO OVERRIDE
    public void processPayment(){
        System.out.println("processing generic payment...");
    }
}
