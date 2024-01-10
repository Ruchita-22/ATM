package com.example.ATM.models;

import lombok.Data;

@Data
public class Card {
    private int cardNumber;
    private int cvv;
    private static int pinNumber  = 1234;
    private String cardHolderName;
    private UserBankAccount userBankAccount;

    public boolean isValidPin(int pin){
        return pinNumber == pin;
    }

}
