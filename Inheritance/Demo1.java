package Inheritance;

public class Demo1 {
    public static void main(String[] args) {
        engineeringStudent es = new engineeringStudent();
        es.markAttendence();
        es.attendLab();
    }
}//Inheritance is the parent(Superclass)-->child(Subclass) relationship method

class Student{
    String name;
    int age;

    void markAttendence(){
        System.out.println("Attendence marked.");
    }

}
class engineeringStudent extends Student{
    void attendLab(){
        System.out.println("Lab attended.");
    }
}
