package com.java.oop.exceptions;

public class Bank {
    static void main() {
        BankOperationService bankOperationService = new BankOperationService();
        try {
            bankOperationService.withdraw(10000);
            bankOperationService.printTransaction();
        }catch (InsufficientException e){
            System.out.println(e.getMessage());
            System.out.println("Code Continues");
        }
    }
}
