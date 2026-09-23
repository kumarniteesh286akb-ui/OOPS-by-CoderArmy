package Generics;

public class generics {
    public static void main(String[] args) {
        Box1<Integer> b1 = new Box1<Integer>(10);//Type arguments
        System.out.println(b1.getValue()+5);
        Box1<String> b2 = new Box1<String>("Hello");
        System.out.println(b2.getValue()+b1.getValue());
    }
}

//Generics ----->
class Box1<T>{
    private T value;
    Box1(T value){
        this.value= value;
    }
    public T getValue(){
        return this.value;
    }
    public void setValue(T value){
        this.value = value;
    }
}