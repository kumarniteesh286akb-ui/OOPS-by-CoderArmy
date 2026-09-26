package Generics;

public class GenericsWithClassAndInterface {
    public static void main(String[] args) {
    Box3<Fish> f1 = new Box3<>();
f1.swim();
    }
}
class Box3<T extends Animal & Swimmable>{
T value;
    public void swim(){
    System.out.println("Your fish is swimming.....");
}
}
class Animal{
    void display(){
        System.out.println("Displaying animal...");
    }

}
interface Swimmable{
    void swim();
}
class Dog extends Animal{}
class Fish extends Animal implements Swimmable{
   @Override
   public void swim(){
       System.out.println("Fish is swimming......");
   }
}