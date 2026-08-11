package com.java.oop.businessusecase.ticketsystem;

import java.math.BigDecimal;

public class BookingService {
    // 1. METHOD OVERLOADING (Compile-Time)

    // Normal Payment
    public void processPayment(Ticket ticket, BigDecimal amountPaid){
        System.out.println( "Processing Card/Cash payment of ₹" + amountPaid + " for PNR: " + ticket.getPnrNumber());
    }

    //UPI Payment
    public void processPayment(Ticket ticket, BigDecimal amountPaid, String upiId){
        System.out.println("Processing UPI payment of ₹" + amountPaid + " via " + upiId + " for PNR: " + ticket.getPnrNumber());

    }


    // 2. RUNTIME POLYMORPHISM (Dynamic Dispatch)
    public void printFinalTicket(Ticket ticket){
        System.out.println("====== Ticket Confirmation ========");
        ticket.displayTicketDetails();
        ticket.printRules();
    }
}
