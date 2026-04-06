package com.auction.core;

public interface Auctionable {
    void updatePrice(double price);
    boolean isActive();
    String details();
}