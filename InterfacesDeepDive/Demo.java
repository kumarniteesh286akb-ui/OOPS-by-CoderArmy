package InterfacesDeepDive;
public class Demo {
    public static void main(String[] args) {
        System.out.println(MathConstant.PI_VALUE);
        MathConstant r1 = new Random();
        r1.fun();
    }
}
//Variables inside interfaces
interface MathConstant{
    double PI_VALUE = 3.14;
    void fun();
}
class Random implements MathConstant{
    @Override
    public void fun(){
        System.out.println(PI_VALUE);
    }
}