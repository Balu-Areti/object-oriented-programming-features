package com.java.oop.polymorphism;

public class Mobile extends Product {
    int screenSize;
    int ram;
    int cpu;
    int cameraInPixel;
    String type;

    Mobile(){
        System.out.println("Mobile product created");
    }

    public Mobile(int id, String name, int maxRetailPrice, byte discountPercentage, float rating, int reviewCount, int screenSize, int ram, int cpu, int cameraInPixel, String type) {
        super(id, name, maxRetailPrice, discountPercentage, rating, reviewCount);
        this.screenSize = screenSize;
        this.ram = ram;
        this.cpu = cpu;
        this.cameraInPixel = cameraInPixel;
        this.type = type;
    }

    //Method Overriding
    public void displayDetails(){
       super.displayDetails();
        System.out.println("Screen Size :" + screenSize);
        System.out.println("Ram : "+ ram);
        System.out.println("CPU : " + cpu);
        System.out.println("camera In Pixel : " + cameraInPixel);
        System.out.println("Type : "+ type);
        System.out.println("-------------------------");
    }

}
