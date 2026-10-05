package com.java.oop.functional;

import java.util.List;

public class Main {
    static void main() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        };
        greeting.greet();

        //Using Lambda Expressions
        /*Syntax
        void m1(int x){}
        m1(100);
        ()->{};
         */
        Greeting greetingLambda = () -> {
            System.out.println("Hello Lambda");
        };
        greetingLambda.greet();


        //3.with parameter
        GreetingWithParameter greetingWithParameter = new GreetingWithParameter() {
            @Override
            public void greetings(String message) {
                System.out.println("Hello " + message);
            }
        };
        greetingWithParameter.greetings("How are you");

        GreetingWithParameter greetingWithParameterLambda = (message) -> {
            System.out.println("Hello " + message);
        };
        greetingWithParameter.greetings("How are you Lambda");


        //here () single parameter no need () so more readablility
        StudentService studentService = studentsList -> {
            for (Student student : studentsList) {
                System.out.println(student);
            }
        };

        Student student1 = new  Student();
        student1.setId(111).setName("John");

        Student student2 = new  Student();
        student2.setId(222).setName("Balu");

        studentService.displayStudents(List.of(
                student1,student2
        ));
    }
}
