package com.auction.services;

import com.auction.entities.Buyer;
import com.auction.items.ElectronicItem;
import com.auction.exceptions.InvalidBidException;

public class AuctionService {

    Buyer topBuyer;

    public void bid(Buyer b, ElectronicItem item, double amount) throws InvalidBidException {

        if (!item.isActive()) {
            throw new InvalidBidException("Auction already closed");
        }

        if (amount <= item.getPrice()) {
            throw new InvalidBidException("Bid too low");
        }

        if (b.getBalance() < amount) {
            throw new InvalidBidException("Not enough money");
        }

        item.updatePrice(amount);
        topBuyer = b;

        System.out.println(b.getName() + " placed $" + amount);
    }

    public void end(ElectronicItem item) {
        item.close();
        System.out.println("\nAuction Ended\n");
        System.out.println("\n***Auction Results***\n");

        if (topBuyer != null) {
            System.out.println("Winner: " + topBuyer.getName());
            System.out.println("Final Price: $" + item.getPrice());
        } else {
            System.out.println("No one bid");
        }
    }
}