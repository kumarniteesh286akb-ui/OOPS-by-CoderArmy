package Strings;

public class Immutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat("World");
        System.out.println(s1);
        String s2 = "Hello";
        System.out.println(s1==s2);


        String s3 = new String("Niteesh");
        String s4 = new String("Niteesh");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = "ja"+"va";
        String s6 = "java";
        System.out.println(s5==s6);



        String s7 = "Hello";
        String s8 = s7+"World";
        String s9 = "Hello World";
        System.out.println(s8 == s9);

        //Problem of Immutability
        String s = "";
        for (int i = 0;i<5;i++){
            s+=i;
            System.out.println(s);
        }

    }
}
