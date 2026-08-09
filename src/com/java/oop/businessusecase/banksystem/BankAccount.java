package com.java.oop.businessusecase.banksystem;

import java.math.BigDecimal;
import java.util.UUID;

//Declare common bank properties
public class BankAccount {
    String accountNumber;
    String accountHolderName;
    BigDecimal balance;
    UUID transactionId;

    BankAccount(){
        System.out.println("Bank account details");
    }

    //Constructor
    public BankAccount(String accountNumber, String accountHolderName, BigDecimal balance, UUID transactionId) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactionId = transactionId;
    }

    public void displayAccountDetails(){
        System.out.println("-----------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name : " + accountHolderName);
        System.out.println("Balance" + balance);
        System.out.println("Transactions : " + transactionId);
    }
    public void calculateInterest() {
        System.out.println("Standard Base Interest: 0%");
    }

}
