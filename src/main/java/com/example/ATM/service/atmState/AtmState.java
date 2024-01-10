package com.example.ATM.service.atmState;

import com.example.ATM.models.Card;
import com.example.ATM.models.enums.TransactionType;

public abstract class AtmState {
    public void insertCard(Atm atm, Card card) {
        System.out.println("Something went wrong");
    }
    public void authenticatePin(Atm atm, Card card, int pin) {
        System.out.println("Something went wrong");
    }
    public void selectOperation(Atm atm, Card card, TransactionType transactionType) {
        System.out.println("Something went wrong");
    }
    public void cashWithdraw(Atm atm, Card card, double amount) {
        System.out.println("Something went wrong");
    }
    public void displayBalance(Atm atm, Card card) {
        System.out.println("Something went wrong");
    }
    public void returnCard(Atm atm) {
        System.out.println("Something went wrong");
    }
    public void exit(Atm atm){
        System.out.println("Something went wrong");
    }
}
