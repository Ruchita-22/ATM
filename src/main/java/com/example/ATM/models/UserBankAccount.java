package com.example.ATM.models;

import lombok.Data;

@Data
public class UserBankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public boolean isSufficientBalance(double amount) {
        return accountBalance >= amount;
    }

    public void deductBalance(double amount) {
        accountBalance -= amount;
    }
}
