public class Overloading{
    public static void main(String[] args){
        Add ad=new Add();
        ad.sum(10,20);
        ad.sum(10,20,30);
    }
}
class Add{
    void sum(int a,int b){
        System.out.println("Sum of two numbers: "+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("Sum of three numbers: "+(a+b+c));   
    }
}