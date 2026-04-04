package com.auction.items;
import com.auction.core.Auctionable;

public class ElectronicItem implements Auctionable {
    private String itemID;
    private double currentPrice;
    private boolean isActive;

    public ElectronicItem(String id, double startingPrice) {
        this.itemID = id;
        this.currentPrice = startingPrice;
        this.isActive = true;
    }

    @Override
    public void updatePrice(double newBid) { this.currentPrice = newBid; }

    @Override
    public boolean isAuctionActive() { return isActive; }

    @Override
    public String getItemDetails() { return "Electronics [ID: " + itemID + ", Price: $" + currentPrice + "]"; }

    public double getCurrentPrice() { return currentPrice; }
    public void closeAuction() { this.isActive = false; }
}