class Animal{
    void sound(){
        System.out.println("All animals makes sound...");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.print("Wow wow...");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.print("Meoww Meoww...");
    }
}
class Polymorphism{
    public static void main(String[] args){
        Animal animal;
        animal = new Dog();
        animal.sound();
        animal=new Cat();
        animal.sound(); 

    }
}