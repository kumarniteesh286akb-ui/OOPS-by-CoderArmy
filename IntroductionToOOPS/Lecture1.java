package IntroductionToOOPS;

class student{
   int rollno;
   String name;
   int marks;



   student(int rollno,String name, int marks){
      this.rollno= rollno;
      this.name = name;
      this.marks = marks;

   }
   student (){
     //calling a constructor from the other constructor
      this(32,"default name",43);
   }

   student( student other){
      this.marks = other.marks;
      this.name = other.name;
      this.rollno= other.rollno;
   }

}
public class Lecture1{
public static void main(String[] args) {
   student Niteesh = new student(46,"niteesh",54);
   System.out.println(Niteesh.marks);
   System.out.println(Niteesh.name);
   System.out.println(Niteesh.rollno);
   student Satish = new student();
   System.out.println(Satish.name);
   student niteesh2 = new student(Niteesh);
   System.out.println(niteesh2.name);
   System.out.println(niteesh2.rollno);
   System.out.println(niteesh2.marks);

   student random = new student();
   System.out.println(random.name);
}
}
