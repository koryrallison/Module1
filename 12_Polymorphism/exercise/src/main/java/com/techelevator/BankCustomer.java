package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    // No Args Constructor

    public BankCustomer(){
    }

    // Methods

    public Accountable[] getAccounts(){
        Accountable[] accountable = new Accountable[accounts.size()];
        return accounts.toArray(accountable);
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    public boolean isVip(){
        int totalBalance = 0;
        getAccounts();
        for(Accountable account : accounts){
            totalBalance += account.getBalance();
        }
        if(totalBalance >= 25000){
            return true;
        }
        return false;
    }

    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
