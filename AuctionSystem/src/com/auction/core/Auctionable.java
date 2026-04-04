package com.auction.core;

public interface Auctionable {
    void updatePrice(double newBid);
    boolean isAuctionActive();
    String getItemDetails();
}