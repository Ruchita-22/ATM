package com.example.ATM.service.atmState;

import com.example.ATM.models.Card;

public class HasCardStage extends AtmState{
    public void authenticatePin(Atm atm, Card card, int pin) {
        if (card.isValidPin(pin)) {
            System.out.println("Successfully Authenticated");
            atm.setAtmState(new CashWithdrawState());
        } else {
            System.out.println("InValid pin");
            atm.setAtmState(new ExitState());
        }
    }
    public void returnCard(Atm atm) {
        System.out.println("Please collect your card");
        atm.setAtmState(new ExitState());
    }
    public void exit(Atm atm){
        returnCard(atm);
        System.out.println("Thanking for choosing us");
        atm.setAtmState(new IdealState());
    }
}
