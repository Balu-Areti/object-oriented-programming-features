package com.java.oop.businessusecase.banksystem;

import java.math.BigDecimal;

public class BankingService {

    // ==========================================
    // 1. METHOD OVERLOADING
    // ==========================================

    // Normal branch deposit
    public void depositMoney(BankAccount account, BigDecimal amount) {

        // Ask BankAccount to update its own balance
        account.deposit(amount);
        System.out.println("Branch Deposit Successful!");
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Updated Balance for " + account.getAccountHolderName() + ": " + account.getBalance());
        System.out.println("-----------------------------------");
    }

    // UPI deposit
    // Same method name, but extra String parameter
    public void depositMoney(BankAccount account, BigDecimal amount, String upiId) {
        // Ask BankAccount to update its own balance
        account.deposit(amount);
        System.out.println("UPI Deposit Successful via ID: " + upiId);
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Updated Balance for " + account.getAccountHolderName() + ": " + account.getBalance());
        System.out.println("-----------------------------------");
    }


    // ==========================================
    // 2. RUN-TIME POLYMORPHISM
    // ==========================================

    // Can accept SavingsAccount OR CurrentAccount
    // Runtime polymorphism
    public void printAccountSummary(BankAccount account) {
        System.out.println("====== FETCHING ACCOUNT SUMMARY ======");
        account.displayAccountDetails();
        account.calculateInterest();
    }
}