import java.util.*;
class BankAccount{
    double balance;
    void deposit(int amount){
        balance+=amount;
         System.out.println("Amount Deposited successfully");
    }
    void withDraw(int amount){
        System.out.println("Amount Withdrawal: "+amount);
        if(balance>amount){
        balance-=amount;
         System.out.println("Withdrawal is done successfully");
        }
        else{
            System.out.println("Withdrawal is not possible");
        }
    }
    void getBalance(){
        System.out.println("Account Balance is "+balance);
    }
    public static void main(String[] args){
        BankAccount ba=new BankAccount();
        ba.deposit(1500);
        ba.withDraw(1000);
        ba.getBalance();
        BankAccount ba1=new BankAccount();
        ba1.deposit(190000);
        ba1.getBalance();
    }
}