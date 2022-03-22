package com.bytebank;

public class Account {
    private double balance;
    private String holder;
    private int bankCode;
    private int number;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public boolean withdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer(double value, Account destino) {
        if (this.balance >= value) {
            this.balance -= value;
            destino.deposit(value);
            return true;
        }
        return false;
    }
}