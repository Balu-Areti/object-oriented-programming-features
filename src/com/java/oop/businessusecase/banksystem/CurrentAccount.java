package com.java.oop.businessusecase.banksystem;

import java.math.BigDecimal;
import java.util.UUID;

public class CurrentAccount extends BankAccount{
    BigDecimal overdraftLimit; //// Example: allowed to withdraw 50,000 extra

    public CurrentAccount(String accountNumber, String accountHolderName, BigDecimal balance, UUID transactionId, BigDecimal overdraftLimit) {
        super(accountNumber, accountHolderName, balance, transactionId);
        this.overdraftLimit = overdraftLimit;
    }
    public void displayAccountDetails(){
        super.displayAccountDetails();
        System.out.println("Account Type : Current Account");
        System.out.println("Overdraft Limit : "+ overdraftLimit);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account Interest: 0% (No interest for Current Accounts)");
    }
}
