import java.util.*;
class Animal{
    void display(){
        System.out.println("There are multiple animals...choose one and mention its sound...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks...");
    }
}
public class Inheritance{
    public static void main(String[] args){
            Dog sound=new Dog();
            sound.bark();
             System.out.println(sound.hashCode());
    }
}