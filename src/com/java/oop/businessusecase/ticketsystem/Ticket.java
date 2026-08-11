package com.java.oop.businessusecase.ticketsystem;

import java.math.BigDecimal;

public class Ticket {
    private String pnrNumber;
    private String passengerName;
    private int age;
    private String phoneNumber;
    private BigDecimal price;

    public Ticket(){    // No-Args Constructor (Java Bean Standard)

    }

    public Ticket(String pnrNumber, String passengerName, int age, String phoneNumber, BigDecimal price) {
        this.pnrNumber = pnrNumber;
        this.passengerName = passengerName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.price = price;
    }

    // 3. GETTERS & SETTERS (Public)
    // (Assume getters and setters for all 5 fields are generated here)


    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // 4.Common Business logic
    public void displayTicketDetails(){
        System.out.println("----------------");
        System.out.println("PNR Number : " + pnrNumber);
        System.out.println("Passenger : " + passengerName);
        System.out.println("Age : " + age);
        System.out.println("Price : "+ price);
    }

    // 5.Method to be overridden (Dynamic Behavior)
    public void printRules() {
        System.out.println("General Ticket Rules Apply.");
    }
}
