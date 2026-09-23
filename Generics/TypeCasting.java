package Generics;

public class TypeCasting {
    public static void main(String[] args) {
        //Upcasting
        String s = "hello";
        Object obj = s;


        System.out.println(obj);



        //DownCasting
        Object obj2 = "Hello";
        String s2 = (String)obj2;
        System.out.println(s2);

        Object obj3 = 10;
        String s3 = (String)obj3;
//this will give the class cast exception and this can not be cast to the string . This is the run time error and the other is the compile time error which is the casting of the type




    }
}
