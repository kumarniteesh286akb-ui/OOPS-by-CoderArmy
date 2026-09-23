package ImportingOfClass;
import ImportingOfClass.College.*;

// when we use the * --> this generally refers that the all the classes are to be imported in the file.

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.print();// This method will give an error here if the method of the student is not public in the class of the college
        Teacher t1 = new Teacher();
        t1.print();


        ImportingOfClass.School.Students s2 = new ImportingOfClass.School.Students();
        s2.print();
    }
}
