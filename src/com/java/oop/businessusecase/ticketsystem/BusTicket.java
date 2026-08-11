package com.java.oop.businessusecase.ticketsystem;

import java.math.BigDecimal;

public class BusTicket extends Ticket{
    private String busoperator;
    private String seatNumber;

    public BusTicket(){

    }

    public BusTicket(String pnrNumber, String passengerName, int age, String phoneNumber, BigDecimal price, String busoperator, String seatNumber) {
        super(pnrNumber, passengerName, age, phoneNumber, price);
        this.busoperator = busoperator;
        this.seatNumber = seatNumber;
    }

    public void displayTicketDetails(){
        super.displayTicketDetails();
        System.out.println("Operator : " + busoperator);
        System.out.println("Seat No : " + seatNumber);
    }

    public void printRule(){
        System.out.println("Bus Rules: Bus will not wait for late arrivals. 1 bag allowed.");
    }


}
