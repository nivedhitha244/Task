package com.auction.services;

import com.auction.entities.Buyer;
import com.auction.items.ElectronicItem;
import com.auction.exceptions.InvalidBidException;

public class AuctionService {

    private Buyer highestBidder;

    public void processBid(Buyer buyer, ElectronicItem item, double bidAmount) throws InvalidBidException {

        if (!item.isAuctionActive()) {
            throw new InvalidBidException("Auction is closed.");
        }

        if (bidAmount <= item.getCurrentPrice()) {
            throw new InvalidBidException("Bid must be higher than $" + item.getCurrentPrice());
        }

        if (buyer.getWalletBalance() < bidAmount) {
            throw new InvalidBidException("Insufficient wallet balance.");
        }

        item.updatePrice(bidAmount);
        highestBidder = buyer;

        System.out.println("Success: " + buyer.getName() + 
                " bid $" + bidAmount + 
                " on " + item.getItemDetails());
    }

    public void closeAuction(ElectronicItem item) {
        item.closeAuction();

        System.out.println("\n--- Auction Closed ---\n");

        if (highestBidder != null) {
            System.out.println("Winner: " + highestBidder.getName());
            System.out.println("Winning Bid: $" + item.getCurrentPrice());
            System.out.println();
        } else {
            System.out.println("No bids placed.");
        }
    }
}