package InterfacesDeepDive;
public class InterfaceInheritance{
    public static void main(String[] args) {
    }
}
interface Animal {
    void eat();

}
interface Dog extends Animal{
void bark();
}




class StreetDog implements Dog{
    public void eat(){
        System.out.println("The dog is eating.....");
    }
    public void bark(){
        System.out.println("The dog is barking......");
    }
}