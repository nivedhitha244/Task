package auction.users;

public class Buyer extends User {
    public double money;

    public Buyer(String name, double money) {
        super(name);
        this.money = money;
    }
}