package com.auction.main;

import com.auction.entities.Buyer;
import com.auction.items.ElectronicItem;
import com.auction.services.AuctionService;
import com.auction.exceptions.InvalidBidException;

public class Main {
    public static void main(String[] args) {

        AuctionService service = new AuctionService();

        ElectronicItem item = new ElectronicItem("L1", 500);
        Buyer b1 = new Buyer("1", "Alice", 1000);
        Buyer b2 = new Buyer("2", "Bob", 1200);

        System.out.println("Auction Start\n");

        try {
            service.bid(b1, item, 1000);
            service.bid(b1, item, 550); // wrong bid
        } catch (InvalidBidException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.bid(b2, item, 1100);
        } catch (InvalidBidException e) {
            System.out.println(e.getMessage());
        }

        service.end(item);
    }
}