class   InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class Bank{
    private double balance;
    void deposit(int amount)throws InsufficientBalanceException {
        if(amount>0){
            balance+=amount;
        }else if(amount<=0){
            throw new InsufficientBalanceException("Amount can't be 0 or negative");
        }
    }
    void Withdraw(int amount)throws InsufficientBalanceException{
        if(balance<0){
            throw new InsufficientBalanceException("Insufficient Balance");
        }else if(amount>balance){
            throw new InsufficientBalanceException("Amount is higher than balance");
        }else {
            balance-=amount;
            System.out.println("Amount Withdrawn: "+amount);
        }
    }
    void getBalance(){
        System.out.println("Account Balance: "+balance);
    }

}

public class ThrowsException {

    public static void main(String[] args )throws InsufficientBalanceException {
        Bank B = new Bank();
    try{
        B.deposit(20);
        B.getBalance();
        B.deposit(-20);
    }catch(InsufficientBalanceException e){
        System.out.println(e.getMessage());
    }try{
        B.Withdraw(10);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        B.getBalance();
}
}