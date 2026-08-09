package com.java.oop.inheritance;

public class Laptop extends Product{
    int ram;
    int screenSize;
    int battery;
    int hardDisk;
    int cpu;
    String operatingSystem;

    public Laptop(){
        //super();
        System.out.println("Lpatop product created");
    }

    public Laptop(int id, String name, int maxRetailPrice, byte discountPercentage, float rating, int reviewCount, int ram, int screenSize, int battery, int hardDisk, int cpu, String operatingSystem) {
        super(id, name, maxRetailPrice, discountPercentage, rating, reviewCount);
        this.ram = ram;
        this.screenSize = screenSize;
        this.battery = battery;
        this.hardDisk = hardDisk;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
    }

    public void displayLaptopDetails(){
        displayProduct();
        System.out.println("Ram : " + ram);
        System.out.println("ScreenSoze : "+ screenSize);
        System.out.println("Battery :" + battery);
        System.out.println("Hard Disk : "+ hardDisk);
        System.out.println("CPU : "+ cpu);
        System.out.println("Operating System" + operatingSystem);
        System.out.println("------------------------");
    }
}
