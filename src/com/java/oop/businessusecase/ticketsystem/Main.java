package com.java.oop.businessusecase.ticketsystem;

import java.math.BigDecimal;

public class Main {
    static void main() {
        TrainTicket train = new TrainTicket("PNR101", "Balu", 26, "98765429",new BigDecimal("1200.00"), "3AC", "B2", 72 );
        FlightTicket flight = new FlightTicket("PNR202", "Balu", 27, "9876543210", new BigDecimal("5500.00"), "AI-404", 15.0);
        BusTicket bus = new BusTicket("PNR303", "Balu", 27, "9876543210", new BigDecimal("800.00"), "Orange Travels", "L4");

        // Service object creation
        BookingService service = new BookingService();

        //Test Overloading
        service.processPayment(train, new BigDecimal("1200.00"), "balu@upi");
        service.processPayment(flight, new BigDecimal("5500.00"));

        // 3. Test Runtime Polymorphism
        service.printFinalTicket(train);
        service.printFinalTicket(flight);
        service.printFinalTicket(bus);


    }
}
