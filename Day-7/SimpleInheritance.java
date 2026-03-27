import java.util.*;
class Parent{
    int x=10;
    void display(){
        System.out.print("I am inside parent");
    }
}
class Child extends Parent{
    void display1(){
        System.out.print("I am inside child");
    }
}
public class SimpleInheritance{
    public static void main(String[] args){
        System.out.print("I am inside main function");
        Child c=new Child();
        c.display1();
    }
}