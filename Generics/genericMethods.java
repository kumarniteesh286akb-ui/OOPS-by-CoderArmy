package Generics;

public class genericMethods {
    public static void main(String[] args) {
        Integer y = getResults(23);
        System.out.println(y);
        printPair(11,"Hello");
    }
    public static <T> T getResults(T x){
        return x;
    }
    public static <T,U> void printPair(T first ,U second){
        System.out.println(first+","+second);//Type -Inference ->Automatically detects the datatype of the inputs

    }
}
