package com.techelevator;

public class CreditCardAccount implements Accountable{

    // Instance Variables
    private String accountHolder;
    private String accountNumber;
    private int debt = 0;

    // Constructor
    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }


    // Methods
    @Override
    public int getBalance() {
        return -getDebt();
    }

    public int pay(int amountToPay){
        return debt -= amountToPay;
    }

    public int charge(int amountToCharge){
        return debt += amountToCharge;
    }

    // Getters and Setters

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }
}
