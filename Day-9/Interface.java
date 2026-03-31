interface A{
    void show();
}
interface B{
    void display();
}
class C implements A,B{
    public void show(){
        System.out.println("I am the show method");
    }
    public void display(){
        System.out.println("I am the display method");   
    }
}
public class Interface{
    public static void main(String[] args){
        C c = new C();
        c.show();
        c.display();
        C b = new C();
        b.show();
        b.display();
    }
}