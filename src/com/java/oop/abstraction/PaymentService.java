package com.java.oop.abstraction;

import com.java.oop.interfaces.CreditCardPayment;

public class PaymentService {


    Payment payment;

//    public PaymentService(CreditCardPayment payment) {
//        this.payment = payment;
//    }

    //Tightly coupled
//    public PaymentService(Payment payment) {
////        this.payment = new Payment(111,111,1000);
////        this.payment = new CODPayment(111,111,100,1);
//        this.payment = payment;
//    }
    //Loosely coupled with Dependencies
//    public PaymentService(Payment payment) {
//        this.payment = payment;
//    }


    //Loosely Coupled
    public void makePayment(Payment payment){
        payment.pay();
    }

}
