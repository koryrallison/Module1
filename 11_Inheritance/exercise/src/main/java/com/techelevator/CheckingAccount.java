package com.techelevator;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountHoldersName, String accountNumber, int balance) {
        super(accountHoldersName, accountNumber, balance);
    }

    public CheckingAccount(String accountHoldersName, String accountNumber) {
        super(accountHoldersName, accountNumber);
        int balance = 0;
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int overdraftFee = 10;
        if(getBalance() - amountToWithdraw > -100){
            super.withdraw(amountToWithdraw);
            if(getBalance() < 0){
                super.withdraw(overdraftFee);
                return super.getBalance();
            }
            if(super.getBalance() > 0){
                return super.getBalance();
            }
        }
        if(getBalance() < 0){
            return super.getBalance();
        }
        return super.getBalance();
    }
}
