package com.java.oop.interfaces;

public class PaymentSevice {
    Payment payment; // here same code we pass object
    CreditCardPayment creditCardPayment;
    UPIPayment upiPayment;

    public PaymentSevice(Payment payment) {
        this.payment = payment;
        this.creditCardPayment = creditCardPayment;
        this.upiPayment = upiPayment;
    }

    public void paymentservice(Payment payment){
        this.payment = payment;
    }
    public void creditcardpaymentservice(CreditCardPayment creditCardPayment){
        this.creditCardPayment = creditCardPayment;
    }
    public void upipaymentservice(UPIPayment upiPayment){
        this.upiPayment = upiPayment;
    }
    public void pay(){
        payment.pay();
    }

}
