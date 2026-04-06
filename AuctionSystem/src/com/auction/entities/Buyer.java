package com.auction.entities;

public class Buyer extends User {
    double balance;

    public Buyer(String id, String name, double balance) {
        super(id, name);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void pay(double amount) {
        balance -= amount;
    }
}