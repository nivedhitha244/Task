package auction.items;

public class Item implements Auctionable {
    public String name;
    private double price;
    private boolean active = true;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setNewPrice(double amount) { this.price = amount; }
    public boolean isOpen() { return active; }
    public double getPrice() { return price; }
    public void stop() { this.active = false; }
}