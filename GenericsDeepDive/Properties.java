package GenericsDeepDive;

import java.util.ArrayList;
import java.util.List;

public class Properties {
    public static void main(String[] args) {
        //Invarient
        Animal animal = new Dog();
        animal.eat();
        animal.walk();

        List<Dog> dog = new ArrayList<>();
//        List<Animal> animals = dog;
//        these are not allowed in java as we can not use convert the list of the dogs to the list of the animals.
//But this is also not allowed in the arrays and this will the runtime error in the code






    }
}
class Animal{
    void eat(){
        System.out.println("Eating....");
    }
    void walk(){
        System.out.println("Walking.....");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking......");
    }
}