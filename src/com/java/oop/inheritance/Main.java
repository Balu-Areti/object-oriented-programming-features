package com.java.oop.inheritance;

public class Main {
    static void main() {
        Product product = new Product(1,"Product1", 243432,(byte) 12,4.5F,23422 );
        product.displayProduct();

        Laptop laptop = new Laptop(123,"laptop",2432432,(byte)12,4.5f,23432,13,4,4,4,4,"Windows 10");
        laptop.displayLaptopDetails();

        Mobile mobile = new Mobile(123, "Mobile", 25000, (byte)12, 4.5F, 23456, 8, 6, 8, 50, "Mobile");
        mobile.displayMobileDeatils();

        System.out.println(mobile.name + "'s Final Price: " + mobile.getFinalPrice());
        System.out.println(mobile.name + "getDiscountAmount : "+ mobile.getDiscountAmount());

    }
}
