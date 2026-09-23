package IntroductionToOOPS;

public class ConstructorChaining {
    public static void main(String[] args) {
        Students s1 = new Students("Niteesh",32,25,"NIT Srinagar");
        System.out.println(s1.age);
        Students s2 = new Students("Niteesh");
        Students s3 = new Students("Mohan",32);
        Students s4 = new Students("Shyam",32,25);
        s1.print();
        s2.print();
        s3.print();
        s4.print();

    }
}
class Students{
    String name; // information/data/characteristics -> instance variable
    int age;
    int rollno;
    String college;

    void marksAttendence(){ // Behaviour --> functions --> instance methods
        System.out.println("Attendence is marked by the "+name);

    }
    Students(){}//Default constructor

    Students(String name){
//        this.name = name;
        this(name,0,0,null);
    }
    Students(String name,int age){
//        this.name = name;
//        this.age= age;
        this(name,age,0,null);
    }
    Students(String name,int age,int rollno){
//        this.name = name;
//        this.age= age;
//        this.rollno= rollno;
        this(name,age,rollno,null);

    }
    Students(String name,int age,int rollno,String college){
        this.name = name;
        this.age= age;
        this.rollno= rollno;
        this.college = college;

    }
    void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
        System.out.println(this.college);
    }


}

