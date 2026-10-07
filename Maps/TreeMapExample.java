package Maps;
import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
     TreeMap<Integer,String> map1 = new TreeMap<>();
     map1.put(101,"Niteesh");
     map1.put(102,"Kumar");
     map1.put(103,"Nimrit");
     map1.put(104,"Arya");
        System.out.println(map1);
//        Methods of the Sorted map
//        map1.firstEntry();
//        map1.lastEntry();
//        map1.lastKey() ;
//        map1.firstEntry();
//        map1.headMap(key);
//        map1.tailMap(key);
//        map1.subMap(fromKey,toKey);

        System.out.println(map1.lowerKey(102));
    }
}
