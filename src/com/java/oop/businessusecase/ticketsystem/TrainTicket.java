package com.java.oop.businessusecase.ticketsystem;

import java.math.BigDecimal;

public class TrainTicket extends Ticket{
    private String berthClass;
    private String coachNumber;
    private int berthNo;

    public TrainTicket(){
        super();
    }

    public TrainTicket(String pnrNumber, String passengerName, int age, String phoneNumber, BigDecimal price, String berthClass, String coachNumber, int berthNo) {
        super(pnrNumber, passengerName, age, phoneNumber, price);
        this.berthClass = berthClass;
        this.coachNumber = coachNumber;
        this.berthNo = berthNo;
    }

    // OVERRIDDEN METHODS
    public void displayTicketDetails(){
        super.displayTicketDetails();
        System.out.println("Berth Class : " + berthClass);
        System.out.println("Coach/Berth : " + coachNumber + "-" + berthNo);
    }

    //@OVERRIDE
    public void printRules(){
        System.out.println("Train Rules: Carry original Govt ID. No loud music after 10 PM.");
    }
}
