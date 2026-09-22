package com.java.oop.exceptions;

public class InsufficientException extends Exception { //this is Compiler time exception because keyword extends
    public InsufficientException(String message) {
        super(message);
    }

}
