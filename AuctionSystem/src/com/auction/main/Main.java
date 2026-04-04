package com.auction.main;

import com.auction.entities.Buyer;
import com.auction.items.ElectronicItem;
import com.auction.services.AuctionService;
import com.auction.exceptions.InvalidBidException;

public class Main {
    public static void main(String[] args) {

        AuctionService auctionService = new AuctionService();

        ElectronicItem laptop = new ElectronicItem("LPT-001", 500.00);
        Buyer buyer1 = new Buyer("B1", "Alice", 1000.00);
        Buyer buyer2 = new Buyer("B2", "Bob", 1200.00);

        System.out.println("\n--- Starting Online Auction ---\n");

        try {
            auctionService.processBid(buyer1, laptop, 1000.00);
        } catch (InvalidBidException e) {
            System.out.println(e.getMessage());
        }

        try {
            auctionService.processBid(buyer1, laptop, 550.00);
        } catch (InvalidBidException e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }

        try {
            auctionService.processBid(buyer2, laptop, 1100.00);
        } catch (InvalidBidException e) {
            System.out.println(e.getMessage());
        }

        auctionService.closeAuction(laptop);
    }
}