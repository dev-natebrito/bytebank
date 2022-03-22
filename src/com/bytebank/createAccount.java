package com.bytebank;

public class createAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        account1.holder = "Nate";
        account1.balance = 6924;
        account1.number = 66767;
        account1.bankCode = 333;
        System.out.println(account1.balance);
        boolean sucessWithdraw = account1.withdraw(555);
        if (sucessWithdraw) {
            System.out.println(account1.balance);
        }
        boolean sucessTransfer = account1.transfer(123, account2);
        if (sucessTransfer) {
            System.out.println(account1.balance);
        }
        System.out.println(account2.balance);
    }
}
