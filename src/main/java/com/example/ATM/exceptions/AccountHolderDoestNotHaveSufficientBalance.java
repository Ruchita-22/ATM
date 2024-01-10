package com.example.ATM.exceptions;

public class AccountHolderDoestNotHaveSufficientBalance extends RuntimeException {
    public AccountHolderDoestNotHaveSufficientBalance() {
    }

    public AccountHolderDoestNotHaveSufficientBalance(String message) {
        super(message);
    }
}
