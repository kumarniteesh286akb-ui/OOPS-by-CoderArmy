package Strings;

public class MehtodsInString {
    public static void main(String[] args) {
        String s1 = new String("Niteesh");

        //Length/Emptyness
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());// Java 11 do not count /includes the white spaces


        // character Access
        System.out.println(s1.charAt(1));
        char [] arr = s1.toCharArray();


        // Comparison Operators
        String s2 = new String("Niteesh");
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));//Lexicographical comparison


        // Comparison
        System.out.println(s1.contains("it"));
        System.out.println(s1.indexOf("i"));


        //Extraction Methods
        System.out.println(s1.substring(1,4));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.trim());
        System.out.println(s1.strip());
        System.out.println(s1.repeat(3));
        System.out.println(s1.replace("i","e"));
        System.out.println(s1.replace("it","et"));


        String s3 = "Niteesh Nimrit Nitrit";
       String[] arr1= s3.split(" ");
        for(String name:arr1){
            System.out.println(name);
        }
        System.out.println(String.join(" ",arr1));

        String s4 = new String(String.valueOf(10));
        System.out.println(s4);

        byte [] arr3 = s3.getBytes();
        for(byte b :arr3){
            System.out.print(b+" ");
        }




        //Advanced
        String s5 = new String("Hello");
        String s6 = s5.intern();// Do not let to point to the same reference



    }
}
