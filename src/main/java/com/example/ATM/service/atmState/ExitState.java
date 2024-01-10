package com.example.ATM.service.atmState;

public class ExitState extends AtmState{
    public void exit(Atm atm){
        System.out.println("ThankYou for using US");
        atm.setAtmState(new IdealState());
    }
}
