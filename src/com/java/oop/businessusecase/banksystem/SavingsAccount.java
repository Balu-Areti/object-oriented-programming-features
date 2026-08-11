package com.java.oop.businessusecase.banksystem;

import java.math.BigDecimal;
import java.util.UUID;

public class SavingsAccount extends BankAccount{
    double interestRate;

    //Constructor
    public SavingsAccount(String accountNumber, String accountHolderName, BigDecimal balance, UUID transactionId, double interestRate) {
        super(accountNumber, accountHolderName, balance, transactionId);
        this.interestRate = interestRate;
    }

    // Method Overriding with 'super'
    public void displayAccountDetails(){
        super.displayAccountDetails();
        System.out.println("Account Type : Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Method Overriding for interest calculation
    public void calculateInterest(){
        // 1. Convert the rate to a BigDecimal
        BigDecimal rate = BigDecimal.valueOf(interestRate / 100);

        // 2. Use .multiply() instead of *
        BigDecimal interestAmount = getBalance().multiply(rate);
        System.out.println("Savings Interest Earned: " + interestAmount);
    }
}
