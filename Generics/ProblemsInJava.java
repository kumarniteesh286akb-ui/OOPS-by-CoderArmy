package Generics;

public class ProblemsInJava {
    public static void main(String[] args) {
Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);



        System.out.println(b1.getValue());

    }
}
class Box{
    private Object value;
    Box(Object value){
        this.value= value;
    }
    public Object getValue(){
        return this.value;
    }
    public void setValue(Object value){
        this.value = value;
    }
}
//Object class-> Too generic (Type information is lost in this case);
// We do not know the datatypes of the data stored in the object class

