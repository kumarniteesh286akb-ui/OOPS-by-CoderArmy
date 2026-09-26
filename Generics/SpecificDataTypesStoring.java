package Generics;

public class SpecificDataTypesStoring {
    public static void main(String[] args) {
        Integer x = 10;
        Box2 <Integer> b1 = new Box2<>();
        b1.value = 10;
        b1.printDouble();
    }
}

//Bounds in Generics
class Box2 <T extends  Number>{
    T value;
    public void printDouble(){
        System.out.println(value.doubleValue());
    }
}