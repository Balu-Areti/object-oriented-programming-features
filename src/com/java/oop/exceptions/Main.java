package com.java.oop.exceptions;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a Number: ");
//        int number1 = scanner.nextInt();
//        System.out.println("Enter a Number");
//        int number2 = scanner.nextInt();
//        int res = number1/number2;
//        System.out.println(res);


        try {
        int res = 100/100;
        int[] nos = new int[-2];
        nos[3] = 423;
        String name = null;
        if(name.equals("Balu")){
            System.out.println("Balu");
        }
        /*} catch (ArithmeticException e) {
            System.out.println("Division by Zero Arithmetic Exception");
            m1();
        }catch (NegativeArraySizeException e){
            System.out.println("Negative Array Size Exception");
            m1();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception");
        }catch (NullPointerException e){
            System.out.println("NullPointer Exception");*/
        }catch (Exception e){
//            System.out.println(e.getMessage());//-2 Code continue
            System.out.println("exception Occurred ");
            m1();
        }

    }
    private static void m1(){
        System.out.println("Code continue");
    }
}
