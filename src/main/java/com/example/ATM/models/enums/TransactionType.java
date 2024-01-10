package com.example.ATM.models.enums;

public enum TransactionType {
    CASH_WITHDRAW, BALANCE_CHECK;
    public static void sendTransactionType(){
        for (TransactionType transactionType : TransactionType.values()) {
            System.out.println(transactionType);
        }
    }
}
