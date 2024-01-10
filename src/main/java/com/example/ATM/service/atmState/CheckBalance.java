package com.example.ATM.service.atmState;

import com.example.ATM.models.Card;

public class CheckBalance extends AtmState {
    @Override
    public void displayBalance(Atm atm, Card card) {
        System.out.println("Your Balance is : "+ card.getUserBankAccount().getAccountBalance());
        atm.setAtmState(new ExitState());
    }
}
