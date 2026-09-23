package Immutable_Class;

public class RulesOfImmutableObjects {
    // Rules of the IMMUTABLE classes
    //mark the class as the final
    // mark the instance variable as the private and the final
    //should not make any setter in the class
    public static void main(String[] args) {
        college College = new college("Nit","Srinagar");
        Student s1 = new Student(22 ,"Niteesh ",College);
        System.out.println(s1.Getage());
        System.out.println(s1.getName());
        System.out.println(s1.getCollege().name);
        s1.getCollege().name = "MIT";
        System.out.println(s1.getCollege().name);

        System.out.println(College.name);

    }
}

// NOT purely immutable
final class Student{
    private final int age;
    private final String name;
    private final college College;
    Student( int age,String name,college college){
        this.name = name;
        this.age = age;
        this.College = college;
    }


    //getters
    public int Getage(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public college getCollege(){
        return College;
    }
}
class college{
    String name;
    String address;
    college(String name, String address){
        this.name = name;
        this.address = address;
    }
}