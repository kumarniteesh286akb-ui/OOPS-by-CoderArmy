package CollectionMethods;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        //size()
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        //Boolean contains(Object o)
        System.out.println(c.contains(2));



        Object[] obj = c.toArray();
        for(Object o :obj){
            System.out.print(o+" ");
        }
        System.out.println();

//        Overloaded version of the toArray
        Integer[] arr = c.toArray(new Integer[0]);
        for(Integer a: arr) {
            System.out.print(a+"  ");
        }
        System.out.println();
        c.addAll(List.of(1,2,3,4,5));
        for(Integer i : c){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println(c);
        c.retainAll(List.of(1,2,3));
        System.out.println(c);

        
    }
}
