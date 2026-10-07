package SetAndMaps;

import java.util.*;

public class TreeSetMethods {
    public static void main(String[] args) {
//        TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        Set<Integer> set1 = new TreeSet<Integer>(List.of(2,3,4,5,6,7));

        set.add(12);
        set.add(45);
        set.add(50);
        set.add(2);
        set.add(98);

//Sortedset Interface

        System.out.println(set.first());
        System.out.println(set.headSet(12));
        System.out.println(set.tailSet(12));
        System.out.println(set.subSet(12,100));
//NavigableSet Interface

        System.out.println(set.lower(98));//Excludes the 98
        System.out.println(set.floor(98));//Includes the 98

        System.out.println(set.higher(2));
        System.out.println(set.ceiling(2));


        System.out.println(set.pollFirst());//Removes the smallest element from the set
        System.out.println(set.pollLast());//Removes the largest element from the set
        System.out.println(set.first());
        System.out.println(set);
        set.add(1);
        set.add(24);
        set.add(15);
        set.add(4);
        System.out.println(set.descendingSet());
        System.out.println(set.descendingSet());

        Iterator<Integer> it = set.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("This is the headset and tailset using the boolean arguments...");
        System.out.println(set.headSet(12,true));
        System.out.println(set.tailSet(4,false));



    }
}
