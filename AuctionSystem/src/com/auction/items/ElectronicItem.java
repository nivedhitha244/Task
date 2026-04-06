package com.auction.items;

import com.auction.core.Auctionable;

public class ElectronicItem implements Auctionable {

    String id;
    double price;
    boolean active = true;

    public ElectronicItem(String id, double price) {
        this.id = id;
        this.price = price;
    }

    public void updatePrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public String details() {
        return "Item: " + id + " | Price: $" + price;
    }

    public double getPrice() {
        return price;
    }

    public void close() {
        active = false;
    }
}