package InterfacesDeepDive;

public class InterfacesDeepDive {
    public static void main(String[] args) {
        Car c = new BlackThar();
        c.drive();
        Payment p = new CreditCard();
        p.pay();
        Payment p1 = new DebitCard();
        p1.pay();
    }
}
interface Car{
    void drive();
}

 abstract class Thar implements Car{
   abstract public void drive();
}
class BlackThar extends Thar{
    @Override
    public void drive(){
    }
}
// polymorphism
interface Payment{
    void pay();
}
class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying via Credit card...");
    }
}
class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via Debit Card.....");
    }
}
