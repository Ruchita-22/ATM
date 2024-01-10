package com.example.ATM.service.atmAmountWithdraw;

import com.example.ATM.service.atmState.Atm;

public class ThousandCashWithdrawProcessor extends CashWithdrawProcessor {

    public ThousandCashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void cashWithdraw(Atm atm, double remainingAmount){

        int numberOfThousandRsNote = (int) (remainingAmount/1000);
        remainingAmount = remainingAmount % 1000;

        if(atm.getNoOfThousandNote() >= numberOfThousandRsNote) {
            atm.deductNoOfThousandNote(numberOfThousandRsNote);
        }
        else {
            remainingAmount = remainingAmount + (numberOfThousandRsNote - atm.getNoOfThousandNote()) * 1000;
            atm.deductNoOfThousandNote(atm.getNoOfThousandNote());
        }

        if(remainingAmount > 0) {
            super.cashWithdraw(atm, remainingAmount);
        }

    }
}
