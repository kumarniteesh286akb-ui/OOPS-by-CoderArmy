package GenericsDeepDive;
import java.util.ArrayList;
import java.util.List;
import GenericsDeepDive.*;
import static GenericsDeepDive.Wildcards.fun;

//Wildcards with upper bound(Extends)
public class WildCard2 {
    public static void main(String[] args) {
        List<Dog1> dog = new ArrayList<>();
        dog.add(new Dog1());
        dog.add(new Dog1());
        fun(dog);
        List<Animal1> animal = new ArrayList<>();
        animal.add(new Animal1());
        animal.add(new Animal1());
        animal.add(new Animal1());
        fun(animal);

    }

//        static void fun(List<? extends Animal> values) {
//        for (Animal a : values) {
//            a.eat();
//        }
//    }
}
