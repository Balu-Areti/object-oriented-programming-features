package com.java.oop.businessusecase.ecommercepayment;

public class Customer {
    // 1. ENCAPSULATION
    private  String customerId;
    private String customerName;
    private String email;
    private String phoneNumber;

    //2 Constructor for (JAVA BEEN no arg)
    Customer(){

    }

    public Customer(String customerId, String customerName, String email, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // getters and setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Business logic
    public void displayCustomerDetails(){
        System.out.println("Customer: " + customerName);
        System.out.println("ID: " + customerId);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("email: " + email);
    }
}
