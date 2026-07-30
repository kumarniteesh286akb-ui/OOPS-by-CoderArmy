package Nested_Classes;

public class Anonymys_class {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(){
            @Override
            void introduce(){
                System.out.println("I am a guest.......");
            }
        };
        p1.introduce();
        p2.introduce();
    }
}

class Person{
    void introduce(){
        System.out.println("Hi, I am a person .....");
    }
}
