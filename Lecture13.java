public class Lecture13 {
    public static void main(String[] args) {
        Student s1 = new Student("Niteesh",32,25,"NIT Srinagar");
        System.out.println(s1.age);
    }
}
    class Student{
        String name; // information/data/characteristics -> instance variable
        int age;
        int rollno;
        String college;

        void marksAttendence(){ // Behaviour --> functions --> instance methods
            System.out.println("Attendence is marked by the "+name);

        }
        Student(){}

        Student(String name, int rollnumber,int age,String college){
            this.name = name;
            this.age = age;
            this.college = college;
            this.rollno = rollnumber;
        }
    }

