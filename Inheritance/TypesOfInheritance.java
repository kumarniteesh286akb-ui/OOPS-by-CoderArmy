package Inheritance;

public class TypesOfInheritance {
    public static void main(String[] args) {
        engineeringStudent1 es = new engineeringStudent1();
        es.markAttendence();
        es.attendLab();
        ITengineeringStudents it1 = new ITengineeringStudents();
        it1.coding();
    }
}
// Single inheritance
class Student1{//parent class
    String name;
    int age;

    void markAttendence(){
        System.out.println("Attendence marked.");
    }

}
 class engineeringStudent1 extends Student1{//child class
    void attendLab(){
        System.out.println("Lab attended.");
    }
}

//Multi Inheritance
class ITengineeringStudents extends engineeringStudent1{

    void coding(){
        System.out.println("The coding has been done by the students of the IT Department.");
    }
}

