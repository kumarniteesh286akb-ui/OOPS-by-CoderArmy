package Abstraction;

public class Interface {
    public static void main(String[] args) {
        car c = new fuelcar();
        c.start();
        c.accelerate();
        c.brake();
    }
}

interface car{
    void start();
    void accelerate();
    void brake();
}

class fuelcar implements car{
    @Override
    public void start(){
        System.out.println("Fuel car is now starting...");
    }
    @Override
    public void accelerate(){
        System.out.println("Fuel car is accelerating..");
    }
    @Override
    public void brake(){
        System.out.println("Fuel car is breaking...");
    }
}

class Electriccar implements car{
    @Override
    public void start(){
        System.out.println("Fuel car is now starting...");
    }
    @Override
    public void accelerate(){
        System.out.println("Fuel car is accelerating..");
    }
    @Override
    public void brake(){
        System.out.println("Fuel car is breaking...");
    }
}
