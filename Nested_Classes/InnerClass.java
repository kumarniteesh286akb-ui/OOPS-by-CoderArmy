package Nested_Classes;

public class InnerClass
 {
  public static void main(String[] args) {
   Outer2 outer = new Outer2();
   Outer2.Inner2 inner1 = outer.new Inner2();
  }
}

class Outer2{
 class Inner2{
//example of the inner class
 }
}
