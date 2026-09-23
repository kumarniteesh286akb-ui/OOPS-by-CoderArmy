package Nested_Classes;

public class Local_class {
    public static void main(String[] args) {
        OuterLocal outer = new OuterLocal();
        outer.greet();
    }

}
class OuterLocal{
    void greet(){
        class Local{
            void sayHello(){
                System.out.println("Hello.....");
            }
        }
        Local local = new Local();
        local.sayHello();
    }
}
