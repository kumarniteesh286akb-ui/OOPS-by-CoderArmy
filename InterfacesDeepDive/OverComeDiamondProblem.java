package InterfacesDeepDive;

public class OverComeDiamondProblem {
    public static void main(String[] args) {
        N n = new N();
        n.fun();
    }
}
interface K{
void fun();
}
interface L extends K{
default void fun(){
    System.out.println("This is the interface L....");
}
}
interface M extends K{
default void fun(){
    System.out.println("This is the interface M.....");
}
}
class N implements L,M{
    @Override
    public void fun(){
        System.out.println("This is the solution of the diamond problem....");
        M.super.fun();
        L.super.fun();
    }
}