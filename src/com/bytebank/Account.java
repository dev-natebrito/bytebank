package com.bytebank;

public class Account {
    double balance;
    String holder;
    int bankCode;
    int number;

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