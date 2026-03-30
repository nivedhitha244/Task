class Animal{
    void sound(){
        System.out.println("All animals makes sound...");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Wow wow...");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meoww Meoww...");
    }
}
class Goat extends Animal{
    void sound(){
        System.out.println("Maeh Maeh..");
    }
}
class Overriding{
    public static void main(String[] args){
        Animal animal;
        animal = new Dog();
        animal.sound();
        animal=new Cat();
        animal.sound(); 
        animal=new Goat();
        animal.sound();
    }
}