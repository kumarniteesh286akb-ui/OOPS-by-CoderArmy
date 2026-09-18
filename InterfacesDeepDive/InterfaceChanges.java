package InterfacesDeepDive;

public class InterfaceChanges {
    public static void main(String[] args) {
        Vehicle v = new par();
        v.drive();
        Vehicle.brake();
    }
}
//After java 8 --> default methods
//After Java 9 --> Private is also available in this field
interface Vehicle{
   default void drive(){
       System.out.println("Vehicle is driving...");
       accelarate();
   }
   static void brake(){
       System.out.println("Vehicle is applying the brake ");
       Vehicle.accelarate();

   }
   static private void accelarate(){
       System.out.println("Vehicle is accelerating...");
   }
}
class par implements Vehicle{
    @Override
    public void drive(){
        System.out.println("The car is driving...");
    }
}