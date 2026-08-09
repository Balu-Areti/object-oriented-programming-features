package com.java.oop.polymorphism;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    byte discountPercentage;
    float rating;
    int reviewCount;

    public Product(){
        System.out.println("product created");
    }

    public Product(int id, String name, int maxRetailPrice, byte discountPercentage, float rating, int reviewCount) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.reviewCount = reviewCount;
    }

    //Method Overriding
    public void displayDetails(){
        System.out.println("-----------------------------------");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Max retail Price : " + maxRetailPrice);
        System.out.println("Disount Price : " + discountPercentage);
        System.out.println("Rating :" + rating);
        System.out.println("Reviews : " + reviewCount);
    }

    public int getFinalPrice(){
        return maxRetailPrice - (maxRetailPrice * discountPercentage / 100);
    }
    public int getDiscountAmount(){
        return maxRetailPrice * discountPercentage / 100;
    }
}
