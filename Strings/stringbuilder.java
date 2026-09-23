package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Niteesh");
        sb.append("Kumar");


        System.out.println(sb);

        sb.insert(2,'o');//NioteeshKumar
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.replace(1,3,"XY");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Niteesh");
        sb1.append("Kumar");
        sb1.append("Nimrit");
        System.out.println(sb1.capacity());



    }
}
