package Immutable_Class;

public class Defensive_Copy {


        // Rules of the IMMUTABLE classes
        //mark the class as the final
        // mark the instance variable as the private and the final
        //should not make any setter in the class
        public static void main(String[] args) {
            College college1 = new College("Nit","Srinagar");
           Student1 s1 = new Student1(22 ,"Niteesh ",college1);
            System.out.println(s1.Getage());
            System.out.println(s1.getName());
            System.out.println(s1.getCollege().name);
            s1.getCollege().name = "MIT";
            System.out.println(s1.getCollege().name);

            System.out.println(college1.name);

        }
    }

    // NOT purely immutable
    final class Student1{
        private final int age;
        private final String name;
        private final College college1;
        Student1(int age, String name, College college1){
            this.name = name;
            this.age = age;
            this.college1 = new College(college1.name,college1.address);//Defensive copy in the constructor
        }


        //getters
        public int Getage(){
            return this.age;
        }
        public String getName(){
            return this.name;
        }
        public College getCollege(){//Defensive copy in the getter
            return new College(this.college1.name,this.college1.address);
        }
    }
    class College{
        String name;
        String address;

        College(String name, String address) {
            this.name = name;
            this.address = address;
        }
    }
