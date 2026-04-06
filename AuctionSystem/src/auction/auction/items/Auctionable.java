package auction.items;

public interface Auctionable {
    void setNewPrice(double amount);
    boolean isOpen();
}