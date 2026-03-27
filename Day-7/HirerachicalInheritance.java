class Father{
    void display(){
        System.out.println("I am Father and I have one son and one daughter");
    }
}
class Son extends Father{
    void job(){
        System.out.println("Since you are going to job I am going to hand over the business to your sister");
    }
}
class Daughter extends Father{
    void business(){
        System.out.println("Since I have my own business I don't have proper time to manage yours. Handhover the business to brother as the job is temporary.");
    } 
}
public class HirerachicalInheritance {
    public static void main(String[] args) {
        Son son = new Son();
        son.display();
        son.job();
        Daughter daughter = new Daughter();
        daughter.display();
        daughter.business();
    }
}
