package com.java.oop.businessusecase.ticketsystem;

import java.math.BigDecimal;

public class FlightTicket extends Ticket{
    private String flightNumber;
    private double baggageLimit;

    public FlightTicket(){}

    public FlightTicket(String pnrNumber, String passengerName, int age, String phoneNumber, BigDecimal price, String flightNumber, double baggageLimit) {
        super(pnrNumber, passengerName, age, phoneNumber, price);
        this.flightNumber = flightNumber;
        this.baggageLimit = baggageLimit;
    }

    // OVERRIDDEN METHODS
    public void displayTicketDetails(){
        super.displayTicketDetails();
        System.out.println("Flight No : " + flightNumber);
        System.out.println("Baggage : "+ baggageLimit + "KGs");
    }
    //Method to be overridden (Dynamic Behavior)
    public void printRules(){
        System.out.println("Flight Rules: Boarding gate closes 45 mins before departure.");
    }
}
