package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank=new Bank();
        Bank bank=new  Bank(123456, 10000.45);
        Bank.Account schet1=bank.new Account(12345);
        schet1.deposit(200);
        schet1.show();






    }
}