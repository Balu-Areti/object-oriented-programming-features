package com.java.oop.polymorphism;

public class ProductService {

    //-> 100000 products
    //Method Overloading
//    public void displayDetails(Product product){
//        product.displayDetails();
//    }
//    public void displayDetails(Laptop laptop){
//        laptop.displayDetails();
//    }
//    public void displayDetails(Mobile mobile){
//        mobile.displayDetails();
//    }

    /** Because of the IS-A relationship (Inheritance), you can pass a Laptop or a Mobile into a method that expects a Product.
     * By doing this, I (just replaced the need for thousands of overloaded methods with just one method.)
     * This concept is called Upcasting.
     * **/

    public void displayDetails(Product product){
        product.displayDetails();
    }

}
