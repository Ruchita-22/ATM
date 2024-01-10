package com.example.ATM.service.atmAmountWithdraw;

import com.example.ATM.service.atmState.Atm;


public class OneHundredCashWithdrawProcessor extends CashWithdrawProcessor {
    public OneHundredCashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void cashWithdraw(Atm atm, double remainingAmount) {
        int numberOfOneHundredRsNote = (int) (remainingAmount/100);
        remainingAmount = remainingAmount % 100;

        if(atm.getNoOfOneHundredNote() >= numberOfOneHundredRsNote) {
            atm.deductNoOfOneHundredNote(numberOfOneHundredRsNote);
        }
        else {
            remainingAmount = remainingAmount + (numberOfOneHundredRsNote - atm.getNoOfThousandNote()) * 100;
            atm.deductNoOfOneHundredNote(numberOfOneHundredRsNote);
        }

        if(remainingAmount > 0) {
           throw new NullPointerException("Amount should be in multiple of 100");
        }

    }

}
