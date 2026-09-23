package InterfacesDeepDive;

public class ResolutionPriorityRule {
    public static void main(String[] args) {
        R r = new R();
        r.fun();
    }
}
interface P{
default void fun(){
    System.out.println("Insider P interface...");
}
}
class Q{
public void fun(){
    System.out.println("Inside the Q class...");
}
}
class R extends Q implements P{
//Priority rule -> The output will be Inside the Q class because it gives the priority to the class if a class is extending a class not to the interfaces....
}
//Difference between the abstract class and the interface
// We use the interface to show the contract /roles/functionalities(can do relationship)
//Abstract Class -> Families of similar class(can-do relationship)



//Marker interface -> The interface which is not empty
// interface clonable /interface serializable/ interface RandomAccess