package com.auction.entities;

public class Buyer extends User {
    private double walletBalance;

    public Buyer(String userId, String name, double balance) {
        super(userId, name);
        this.walletBalance = balance;
    }

    public double getWalletBalance() { return walletBalance; }

    public void deductAmount(double amount) {
        this.walletBalance -= amount;
    }
}