package StaticAndFinal;

public class Lecture15 {
    public static void main(String[] args) {
    Student.collegeName = "NIT SRINAGAR";
    Student s1 = new Student("Niteesh",32,101);
    Student s2 = new Student("Rohit",23,102);

    s1.print();
    s2.print();
}
}

// Static keywords

class Student{
    String name;
    int age;
    int rollno;
    static String collegeName;
    Student(String name,int age,int rollno){
        this.name = name;
        this.age = age;
        this.rollno= rollno;

    }
    void print(){
        System.out.println("The name of the student is : "+this.name);
        System.out.println("The age of the student is : "+this.age);
        System.out.println("The rollno of the student is : "+this.rollno);
        System.out.println("The college name of the student is : "+Student.collegeName);
    }



    // static block
    static {
        collegeName = "NIT SRINAGAR";
    }
}
