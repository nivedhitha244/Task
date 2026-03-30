import java.util.*;
public class Encapsulation{
    int a;
    Encapsulation(int a){
        this.a=a;
    }
    void setValue(int a){
        this.a=a;
    }
    void getValue(){
        System.out.print("Value of a:"+a);
    }
    public static void main(String[] args){
        Encapsulation e=new Encapsulation(20);//initial value
        e.setValue(30);//updated value
        e.getValue();
    }
}