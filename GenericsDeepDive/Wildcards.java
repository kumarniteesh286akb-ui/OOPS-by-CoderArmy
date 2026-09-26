package GenericsDeepDive;

import java.util.*;

public class Wildcards {
    public static void main(String[] args) {
        List<Dog1> dogs = new ArrayList<>();
        dogs.add(new Dog1());
        dogs.add(new Dog1());
        dogs.add(new Dog1());

        List<Animal1> animals = new ArrayList<>();
        animals.add(new Animal1());
        animals.add(new Animal1());
        animals.add(new Animal1());

        fun(animals);
        fun(dogs);// valid too, since Dog1 extends Animal1

    }

   static void fun(List<? extends Animal1> value) {
        for (Animal1 a : value) {
            a.eat();
        }
    }
}
class Animal1 {
    void eat() {
        System.out.println("Animal is  Eating...");
    }
    void walk() {
        System.out.println("Walking....");
    }
}

class Dog1 extends Animal1 {
    @Override
    void eat(){
        System.out.println("Dog is eating....");
    }
    void bark() {
        System.out.println("Barking....");
    }
}