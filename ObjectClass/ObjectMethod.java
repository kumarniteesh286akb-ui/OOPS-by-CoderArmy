package ObjectClass;

import java.util.Objects;

public class ObjectMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
    student s1 = new student();
    s1.name= "niteesh";
    s1.age=28;
    System.out.println(s1.toString());
    student s2 = new student();
    s2.name= "niteesh";
    student s4 = s1;
    s2.age=28;
        System.out.println(s1.equals(s2));
    student s3 = null;// This will give the null pointer exception
        System.out.println(s1.equals(s3));
Integer i= 28;// Now comparing this will give the class cast exception
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s1.hashCode()==s2.hashCode());
//        System.out.println(s1.hashCode()==s4.hashCode());
//        System.out.println(s1.getClass().getName());
//        System.out.println(s1 instanceof student);
        student s5 = (student)s1.clone();// After implementing the clonable interface this will not give an error while overriding the clone method.
        System.out.println(s5.name);
    }


}
class student extends Object implements Cloneable{
    int age ;
    String name;
    @Override
    public String toString(){
        return (name+" ,"+age);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj ) return true;// if both the references are same or not
        if(obj == null){// this has stopped the Null pointer error
            return false;
        }
        // check if both the class are of the same type
        // if not checked --> Class Cast Exception
        if(obj.getClass() != this.getClass()){
            return false;
        }
        student s = (student ) obj;
        return (this.name == s.name && this.age ==s.age);
    }
    @Override// This will override the methods of the hashcode
    public int hashCode(){
//        int result = 17;
//        result = result*31+age;
//        result =result*31+((name ==null)?0:name.hashCode());
//return result;
        return Objects.hash(name,age);//Objects is the method of the java.util package in the java
    }
    protected Object clone() throws CloneNotSupportedException{
       return super.clone();
    }
}


//instanceOf operator ->> check if an object is instance of a class or any of its subclass