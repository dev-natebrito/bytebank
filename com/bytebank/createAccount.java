package com.bytebank;

public class createAccount {
    public static void main(String[] args) {
        account account1 = new account();
        account account2 = new account();
        account1.holder = "Nate";
        account1.balance = 6924;
        account1.number = 66767;
        account1.bankCode = 333;
        System.out.println(account1.balance);
        account1.withdraw(555);
        System.out.println(account1.balance);
        account1.transfer(123,account2);
        System.out.println(account1.balance);
        System.out.println(account2.balance);
    }
}