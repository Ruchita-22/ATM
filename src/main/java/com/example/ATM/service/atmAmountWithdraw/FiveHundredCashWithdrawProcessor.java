package com.example.ATM.service.atmAmountWithdraw;

import com.example.ATM.service.atmState.Atm;

public class FiveHundredCashWithdrawProcessor extends CashWithdrawProcessor{
    public FiveHundredCashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void cashWithdraw(Atm atm, double remainingAmount) {
        int numberOfFiveHundredRsNote = (int) (remainingAmount/500);
        remainingAmount = remainingAmount % 500;

        if(atm.getNoOfFiveHundredNote() >= numberOfFiveHundredRsNote) {
            atm.deductNoOfFiveHundredNote(numberOfFiveHundredRsNote);
        }
        else {
            remainingAmount = remainingAmount + (numberOfFiveHundredRsNote - atm.getNoOfThousandNote()) * 500;
            atm.deductNoOfFiveHundredNote(numberOfFiveHundredRsNote);
        }

        if(remainingAmount > 0) {
            super.cashWithdraw(atm, remainingAmount);
        }

    }
}
