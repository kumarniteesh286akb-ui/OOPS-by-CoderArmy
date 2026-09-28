package GenericsDeepDive;

import java.util.ArrayList;
import java.util.List;

public class SuperInWildcards {
    public static void main(String[] args) {
        List<Dog1>dog1s = new ArrayList<>();
        dog1s.add(new Dog1());
        dog1s.add(new Dog1());
        dog1s.add(new Dog1());
        dog1s.add(new Dog1());
        dog1s.add(new Dog1());

        List<Animal1>animal = new ArrayList<>();
        animal.add(new Animal1());
        animal.add(new Animal1());
        animal.add(new Animal1());
        animal.add(new Animal1());
        animal.add(new Animal1());
        fun1(animal);





    }
    //Generics With the Lower Bound(Super)
    public static void fun1(List<? super Animal1> values){
        //Writing
        values.add(new Animal1());
        values.add(new Labradore());
        values.add(new Cat());
        for(Object a:values){
        Animal1 b = (Animal1)a;
        b.eat();
        }


    }
}
class Labradore extends Dog1{

}
