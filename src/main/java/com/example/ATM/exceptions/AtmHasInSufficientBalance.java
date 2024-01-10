package com.example.ATM.exceptions;

public class AtmHasInSufficientBalance extends RuntimeException{
    public AtmHasInSufficientBalance() {
    }

    public AtmHasInSufficientBalance(String message) {
        super(message);
    }
}
