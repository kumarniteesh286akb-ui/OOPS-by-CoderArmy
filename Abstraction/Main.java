package Abstraction;

public class Main {
    public static void main(String[] args) {
        Car c = new electricCar();
        Car c1 = new fuelCar();

        c1.start();
        c.start();
        c.accelerate();
        c1.accelerate();
        c.brake();
        c1.brake();

    }

}
abstract class Car{
    void start(){
        System.out.println("The car is starting.....");
    }
    abstract void brake();
    abstract void accelerate();
}
class electricCar extends Car{


@Override
    void start(){

        System.out.println("The electric car is starting......");
    }
    @Override
    void brake(){
        System.out.println("The brake of the electric car is being applied...");

    }
    void accelerate(){
        System.out.println("The electric car is being accelerated....");

    }

}

class fuelCar extends Car{
    void brake(){
        System.out.println("The brake of the fuel car is being applied...");

    }
    void accelerate(){
        System.out.println("The fuelcar is being accelerated....");
    }
}