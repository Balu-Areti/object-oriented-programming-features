package com.java.oop.businessusecase.banksystem;

import java.math.BigDecimal;
import java.util.UUID;

//Declare common bank properties
public class BankAccount {
//    String accountNumber;
//    String accountHolderName;
//    BigDecimal balance;
//    UUID transactionId;
    private String accountNumber;
    private String accountHolderName;
    private BigDecimal balance;
    private UUID transactionId;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }


    //Constructor
    public BankAccount(String accountNumber, String accountHolderName, BigDecimal balance, UUID transactionId) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactionId = transactionId;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
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
