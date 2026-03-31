interface Payment{
    void pay(double amount);
}
class CashPayment implements Payment{
    public void pay(double amount){
        System.out.println("paid "+amount+" by cash payment");
    }
}
class UPIPayment implements Payment{
    public void pay(double amount){
        System.out.println("paid "+amount+" by UPI payment");
    }
}
class CreditPayment implements Payment{
    public void pay(double amount){
        System.out.println("paid "+amount+" by credit payment");
    }
}
class DebitPayment implements Payment{
    public void pay(double amount){
        System.out.println("paid "+amount+" by Debit payment");
    }
}
public class PaymentInterface {
    public static void main(String[] args) {
        Payment p=new CashPayment();
        p.pay(1000.00);
    }
}
