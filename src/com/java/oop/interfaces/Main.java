package com.java.oop.interfaces;

import com.java.oop.abstraction.PaymentService;

public class Main {
    static void main() {

        UPIPayment upiPayment1 = new UPIPayment(111,111,100,"12NOV");
        DebitCardPayment debitCardPayment = new DebitCardPayment(111,123,1234,1012345, 10);

        PaymentSevice paymentSevice = new PaymentSevice(debitCardPayment);
        paymentSevice.pay();

        PaymentSevice Ps = new PaymentSevice(upiPayment1);
        Ps.pay();

        CreditCardPayment creditCardPayment = new CreditCardPayment(111,1234,1100,98765431, "Customer1","AUG1");
        PaymentSevice ps1 = new PaymentSevice(creditCardPayment);
        ps1.pay();
        ps1.isrefunded(creditCardPayment);

        ps1.isrefunded(upiPayment1);
    }
}
