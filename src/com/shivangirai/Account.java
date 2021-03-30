package com.shivangirai;

public class Account {
    double balance;
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Balance is: " + balance);
    }
    void withdrawal(double amount){
        if (amount > balance){
            System.out.println("you dont have sufficient balance in your account");
        } else {
            balance = balance - amount;
            System.out.println("Balance is: " +balance);
        }
    }
    public double getBalance() {
        return balance;
    }
}


