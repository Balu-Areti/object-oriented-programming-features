package com.java.oop.businessusecase.banksystem;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting Banking Application...");
        System.out.println();

        // 1. Create Objects (Ingredients) // Using BigDecimal for exact money values and UUID for transaction IDs
        SavingsAccount savingsObj = new SavingsAccount("SBIN00123", "Balu", new BigDecimal("50000.00"), UUID.randomUUID(), 4.5);
        CurrentAccount currentObj = new CurrentAccount("HDFC00999", "Tech Solutions", new BigDecimal("200000.00"), UUID.randomUUID(), new BigDecimal("50000.00")); // Overdraft limit

        // 2. Initialize Service // 3. Polymorphism in action // We pass different child objects to a method expecting the parent 'BankAccount'
        BankingService bankService = new BankingService();
        bankService.printAccountSummary(savingsObj);
        bankService.printAccountSummary(currentObj);

        // 4. Overloading in action // Calling the same 'depositMoney' method name, but Java knows which one to use based on parameters
        bankService.depositMoney(savingsObj, new BigDecimal("5000.00"));

        // Triggers the overloaded UPI deposit method because of the 3rd String parameter
        bankService.depositMoney(currentObj, new BigDecimal("15000.00"), "balu@oksbi");
    }
}