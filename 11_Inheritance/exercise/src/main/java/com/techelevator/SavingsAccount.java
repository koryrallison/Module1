package com.techelevator;

public class SavingsAccount extends BankAccount{
    private final int SAVINGS_FEE = 2;

    public SavingsAccount(String accountHoldersName, String accountNumber){
        super(accountHoldersName, accountNumber);
        int balance = 0;
    }

    public SavingsAccount(String accountHoldersName, String accountNumber, int balance) {
        super(accountHoldersName, accountNumber, balance);
    }


    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw > 150) {
            return super.withdraw(amountToWithdraw);
        }
        if (getBalance() - amountToWithdraw - SAVINGS_FEE < 150 && getBalance()
                - amountToWithdraw - SAVINGS_FEE >= 2) {
            super.withdraw(amountToWithdraw);
            super.withdraw(SAVINGS_FEE);
            return getBalance();
        }
        return getBalance();
    }

}
