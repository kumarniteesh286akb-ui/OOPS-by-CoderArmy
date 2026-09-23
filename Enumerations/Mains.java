package Enumerations;

public class Mains {
    public static void main(String[] args) {
int status = PaymentStatus1.SUCCESS;
Paymentstatus status1 = Paymentstatus.SUCCESS;
        System.out.println(status1.name());

Direction d = Direction.NORTH;
        System.out.println(d.getDegree());



    }
}

enum Paymentstatus{
    SUCCESS,
    FAILED,
    PENDING;
}
enum Direction {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);
     private int degree;
     Direction(int degree){
         this.degree= degree;
     }
     public int getDegree(){
         return this.degree;
     }



}
class PaymentStatus1{
    // This is a class which is constant and finalize
    public static final int SUCCESS = 1;
    public  static final int  FAILED =2;
    public static final int  PENDING = 3;
}