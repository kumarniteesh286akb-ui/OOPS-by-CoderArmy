package Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("Niteesh ",12));
        s.add(new Student("Kumar ",22));
        s.add(new Student("Nimrit ",32));
        s.add(new Student("Arya",42));
        s.add(new Student("Arya",22));
        Collections.sort(s);//Ascending Order
        for(Student s1 : s){
            System.out.println(s1.name+" "+s1.marks);
        }
    }
}
class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo( Student other){
        if(this.marks!= other.marks) {
            return this.marks - other.marks;
        }else{
        return this.name.compareTo(other.name);
        }
    }



}