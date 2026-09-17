package Enumerations;

public class Demo {
    public static void main(String[] args) {
        Direction1 d = Direction1.NORTH;
        d.move();
        Direction1 [] directions = Direction1.values();
        for(Direction1 d1: directions){
            System.out.println(d1);
            System.out.println(d1.ordinal());
        }

            Direction1 d2 = Direction1.valueOf("EAST");// This will give the Illegal Argument Exception when the argument inside the value of do not match the name of any object in the enum
            System.out.println(d2.name());
    }
}
enum Direction1{
    NORTH{
        @Override
        public void move() {
            System.out.println("Move up (Y+1) ");
        }
    },
    SOUTH{
        @Override
        public void move() {
            System.out.println("Move down (Y-1) ");
        }
    },
    EAST{
        @Override
        public void move() {
            System.out.println("Move right (X+1) ");
        }
    },
    WEST{
        @Override
        public void move() {
            System.out.println("Mover left(X-1)");
        }
    };
    public abstract void move();
}