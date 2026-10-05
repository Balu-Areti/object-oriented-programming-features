package com.java.oop.Anonymous;

public class Main {
    static void main() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.printf("Hello");
            }

            @Override
            public void greet(String message) {
                System.out.printf(message);
            }
        };
        greeting.greet();
        greeting.greet("Hello How are you?");
    }
}
