package com.example.ATM.service.atmState;

import com.example.ATM.models.Card;

public class DisplayState extends AtmState{
    public void displayScreen(Atm atm, Card card) {
        System.out.println("Something went wrong");
        atm.setAtmState(new ReturnCardState());
    }
}
