package com.example.ATM.service.atmAmountWithdraw;

import com.example.ATM.service.atmState.Atm;

/*
Chain of Responsibility
 */
public abstract class CashWithdrawProcessor {
    private  CashWithdrawProcessor nextCashWithdrawProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        this.nextCashWithdrawProcessor = nextCashWithdrawProcessor;
    }

    public void cashWithdraw(Atm atm, double remainingAmount) {
        if(nextCashWithdrawProcessor != null) {
            nextCashWithdrawProcessor.cashWithdraw(atm, remainingAmount);
        }
    }

}
