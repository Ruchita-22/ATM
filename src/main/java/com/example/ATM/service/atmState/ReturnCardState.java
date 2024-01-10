package com.example.ATM.service.atmState;

public class ReturnCardState extends AtmState{
    public void returnCard(Atm atm) {
        System.out.println("Card Collected");
        atm.setAtmState(new ExitState());
    }
}
