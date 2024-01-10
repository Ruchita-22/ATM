package com.example.ATM.models;

import lombok.Data;

@Data
public class User {
    private Card card;
    private UserBankAccount userBankAccount;
}
