package com.example.ATM.service.atmState;

import com.example.ATM.models.Card;

public class IdealState extends AtmState {
    public void insertCard(Atm atm, Card card) {
        System.out.println("Welcome");
        atm.setAtmState(new HasCardStage());
    }
}
