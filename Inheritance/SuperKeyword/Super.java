package Inheritance.SuperKeyword;

public class Super {
    public static void main(String[] args) {
    engineeringStudent es= new engineeringStudent("Niteesh kumar",32,43,"NIT SRINAGAR","INFORMATION TECHNOLOGY");
    es.print();
    }
}


class Students {
    String name;
    int age;
    int rollNo;



    Students(){}

    Students(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo= rollNo;
    }
    void print(){
        System.out.println(name +"  , "+age+ " , "+rollNo);
    }
}
class engineeringStudent extends Students{
    String college;
    String branch;

    engineeringStudent(String name,int age,int rollNo,String college,String branch){
       super(name,age,rollNo);
        this.college = college;
        this.branch = branch;
    }
    void print (){
        super.print();
        System.out.println(college);
    }
}