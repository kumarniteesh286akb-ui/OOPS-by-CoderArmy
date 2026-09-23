package Nested_Classes;

public class StaticNestedClass {
    public static void main(String[] args) {


        Outer outer  = new Outer();

        // this Outer always asks for the object of its class;
 Outer.Inner inner = new Outer.Inner(outer);


inner.fun();



    }
}


//  Static nested class

class Outer{
    static int x = 4;
    int y;

    static class Inner{

    Outer outer;
        Inner(Outer outer){
            this.outer = outer;
        }

        // static method cannot take the non static references

        // If a class is static then there is no need to make the object of that class the static method or behaviour can be called by directly dot operator.
        // Such as Outer.Inner
void fun(){
    System.out.println(x);
    System.out.println(outer.y);
}



    }
}



class BankAccount{
   private static class InterestCalculator{
        static double calculateYearly(double principal,double rate){
            return principal*rate;
        }
    }
    public double computeInterest(double principal){
        return InterestCalculator.calculateYearly(principal,0.009);
    }
}