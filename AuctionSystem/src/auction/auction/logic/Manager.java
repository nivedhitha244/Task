package auction.logic;

import auction.users.Buyer;
import auction.items.Item;

public class Manager {
    private Buyer topBidder;

    public void placeBid(Buyer b, Item i, double amt) throws Exception {
        if (!i.isOpen()) throw new Exception("Auction is already over!");
        if (amt <= i.getPrice()) throw new Exception("Bid is too low!Bidding is not possible!!!\n");
        if (b.money < amt) throw new Exception("Not enough cash!");

        i.setNewPrice(amt);
        topBidder = b;
        System.out.println(b.getName() + " bid $" + amt + " on " + i.name+"\n");
    }

    public void finish(Item i) {
        i.stop();
        System.out.println("\n SOLD OUT\n");

        if (topBidder != null) {
            System.out.println("Winner: " + topBidder.getName() + " at $" + i.getPrice()+"\n");
        } else {
            System.out.println("No one bought it.");
        }
    }
}