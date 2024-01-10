package com.example.ATM.exceptions;

public class SomethingWentWrong extends RuntimeException{
    public SomethingWentWrong() {
    }

    public SomethingWentWrong(String message) {
        super(message);
    }
}
