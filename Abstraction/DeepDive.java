package Abstraction;

public class DeepDive {
    public static void main(String[] args) {
    }
}
abstract class Animal{

    String name;
    Animal (String name){
        this.name = name;


        }
        void sleep(){
            System.out.println("Sleeping");

    }
    abstract void makeSound();
}

class Dog extends Animal{
    Dog(String name){
        super(name);

    }
    void makeSound(){
        System.out.println("Dog is barking...");
    }
}