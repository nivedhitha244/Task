import java.util.*;
class Bank {
    int balance=1000;
    void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is going to withdraw");
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Remaining balance is "+balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }
     
}
public class ConcurrencyImplementation {
    public static void main(String[] args) {
        Bank b=new Bank();
        Runnable task=()->{
            b.withdraw(500);
        };
        Thread t1=new Thread(task,"User1");
        Thread t2=new Thread(task,"User2");
        t1.start();
        t2.start();
    }
    
}