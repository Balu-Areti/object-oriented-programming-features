package com.java.oop.exceptions;

public class BankOperationService {
    int balance = 10000;
    int lockInBalance = 500;
    public boolean withdraw(int amount) throws InsufficientException {
        boolean isWithdrawSucessful = false;
        if(amount > (balance - lockInBalance)){
            throw new InsufficientException("Insufficient funds you can withdraw max amount : " + (balance-lockInBalance));

        }else {
            balance -= amount;
            System.out.println("Transaction Successful");
            isWithdrawSucessful = true;
        }
        return isWithdrawSucessful;
    }
    public void printTransaction(){
        System.out.println("Transaction Complted");
        System.out.println("Transaction ID : 2333456");
    }

}
