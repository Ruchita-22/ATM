package com.example.ATM.service.atmState;

import com.example.ATM.service.atmAmountWithdraw.CashWithdrawProcessor;
import com.example.ATM.service.atmAmountWithdraw.FiveHundredCashWithdrawProcessor;
import com.example.ATM.service.atmAmountWithdraw.OneHundredCashWithdrawProcessor;
import com.example.ATM.service.atmAmountWithdraw.ThousandCashWithdrawProcessor;
import com.example.ATM.exceptions.AccountHolderDoestNotHaveSufficientBalance;
import com.example.ATM.exceptions.AtmHasInSufficientBalance;
import com.example.ATM.models.Card;

public class CashWithdrawState extends AtmState{

    @Override
    public void cashWithdraw(Atm atm, Card card, double amount) {
        if(atm.getAtmBalance() < amount) {
            throw new AtmHasInSufficientBalance("Atm Has Insufficient Balance");
        } else if(! card.getUserBankAccount().isSufficientBalance(amount)) {
            throw new AccountHolderDoestNotHaveSufficientBalance("You have Insufficient balance");
        } else {
            card.getUserBankAccount().deductBalance(amount);
            atm.deductBalance(amount);
            CashWithdrawProcessor cashWithdrawProcessor = new ThousandCashWithdrawProcessor(new FiveHundredCashWithdrawProcessor(new OneHundredCashWithdrawProcessor(null)));
            cashWithdrawProcessor.cashWithdraw(atm, amount);

        }
        System.out.println("Request Successful");
        atm.setAtmState(new CheckBalance());
    }


}
