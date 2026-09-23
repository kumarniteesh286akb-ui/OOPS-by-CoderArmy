package Strings;

public class DeclarationMethods {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String ("");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        String s3 = new String("Hello");
        String s4 = "Niteesh";
        String s5 = new String(s4);


        char [] arr = {'N','i','t','e','e','s','h'};
        String s6 = new String(arr);
        String s7 = new String(arr,0,4);
        System.out.println(s7);


        byte[] arr2 = {97,98,99};
        String s8 = new String(arr2);
        System.out.println(s8);


        //String Builder and String Buffer

        StringBuilder sb = new StringBuilder("Hello");
        String s9 = new String(sb);
        System.out.println(sb);
        StringBuffer ab = new StringBuffer("World");
        System.out.println(ab);
    }
}


