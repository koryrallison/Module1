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
        int balance = super.getBalance();
        int overdraftFee = 10;
        int balanceAfterWithdraw = super.withdraw(amountToWithdraw);
        // int balanceAfterWithdraw = balance - amountToWithdraw;

        if (balance <= -100){
            return super.getBalance();
        }
        else if (balanceAfterWithdraw >= 0){
            return balanceAfterWithdraw;
        }
        else if (balanceAfterWithdraw > -100) {
            balanceAfterWithdraw -= overdraftFee;
            return (super.getBalance() - amountToWithdraw) - overdraftFee;
        }
        return super.getBalance();
    }
}
