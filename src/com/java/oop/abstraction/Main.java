package com.java.oop.abstraction;

public class Main {
    static void main() {
        Customer customer = new Customer(111, "Customer", "customer1@gmail.com", "9192939491", "RJY");
        Payment payment = new Payment(111, 111, 1000);
        CreditCardPayment creditCardPayment = new CreditCardPayment(111,1111,1201,"12349876543","Madhu", "AUG2099");
        DebitCardPayment debitCardPayment = new DebitCardPayment(111,11,1000,"876541234",10);
        UpiPayment upiPayment = new UpiPayment(1,111,1000,"123");

        PaymentService paymentService = new PaymentService();
        paymentService.makePayment(upiPayment);

    }
}
