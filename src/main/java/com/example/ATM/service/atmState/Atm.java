package com.example.ATM.service.atmState;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atm {

    private static Atm atm = new Atm();
    private AtmState atmState;
    private double atmBalance;
    private int noOfFiveHundredNote;
    private int noOfOneHundredNote;
    private int noOfThousandNote;

    public static Atm getInstance(){
        return atm;
    }
    private Atm(){

    }
    public static Atm getAtmState(Atm atm){
        atm.setAtmState(new IdealState());
        return atm;
    }
    public void setBalance(double atmBalance, int noOfFiveHundredNote, int noOfOneHundredNote, int noOfThousandNote) {
        this.atmBalance = atmBalance;
        this.noOfFiveHundredNote = noOfFiveHundredNote;
        this.noOfOneHundredNote = noOfOneHundredNote;
        this.noOfThousandNote = noOfThousandNote;
    }

    public void deductBalance(double amount) {
        atm.setAtmBalance(atm.getAtmBalance() - amount);
    }
    public void deductNoOfOneHundredNote(int oneHundredNote) {
        atm.setNoOfOneHundredNote(atm.getNoOfOneHundredNote() - oneHundredNote);
    }
    public void deductNoOfFiveHundredNote(int fiveHundredNote) {
        atm.setNoOfFiveHundredNote(atm.getNoOfFiveHundredNote() - fiveHundredNote);
    }
    public void deductNoOfThousandNote(int thousandNote) {
        atm.setNoOfThousandNote(atm.getNoOfThousandNote() - thousandNote);
    }
    public void printAtmBalance() {
        System.out.println("ATM Balance : "+atm.getAtmBalance());
        System.out.println("100 Rs Notes : "+ atm.getNoOfOneHundredNote());
        System.out.println("500 Rs Notes : "+ atm.getNoOfFiveHundredNote());
        System.out.println("1000 Rs Note : "+ atm.getNoOfThousandNote());
    }
}
