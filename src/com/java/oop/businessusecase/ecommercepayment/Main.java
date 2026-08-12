package com.java.oop.businessusecase.ecommercepayment;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    static void main() {
        // 1. COMPOSITION (HAS-A): Create the Customer first
        Customer customer = new Customer("Cus1", "Balu", "balu@gmail.com", "9879879871");

        // 2. INHERITANCE & ENCAPSULATION: Create specific payments
        // Notice we are using String for BigDecimal and LocalDate.now() for current date
        UpiPayment upiPayment = new UpiPayment("TXN101",customer, new BigDecimal("1500.00"), LocalDate.now(), "Pending", "balu@oksvi","SBI");

        CreditCardPayment creditCardPayment = new CreditCardPayment("TXN-CARD-202", customer, new BigDecimal("45000.00"), LocalDate.now(), "PENDING", "XXXX-XXXX-XXXX-1234", "VISA", 150);

        // 3. Initialize the Gateway Service
        PaymentGatewayService gateway = new PaymentGatewayService();

        // 4. TEST RUNTIME POLYMORPHISM
        // Parent reference (Payment) is executing Child (UPI/Card) logic dynamically!

        gateway.executePayment(upiPayment);
        gateway.executePayment(creditCardPayment);

        // 5. TEST METHOD OVERLOADING
        gateway.processRefund(upiPayment);                                // Calls Full Refund method
        gateway.processRefund(creditCardPayment, new BigDecimal("5000.00"));    // Calls Partial Refund method
    }
}
