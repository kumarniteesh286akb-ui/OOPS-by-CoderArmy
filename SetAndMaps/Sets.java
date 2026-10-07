package SetAndMaps;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("NITEESH");
    set.add("Kumar");
    set.add("Sateesh");
    set.add("Verma");
    String s = "niteesh";
        System.out.println(set.contains(s.toUpperCase()));

    Map<Integer,String> map = new HashMap<>();
    map.put(102,"Niteesh");
    map.put(103,"Kumar");
    map.put(105,"Satish");

        System.out.println(map.containsKey(102));
        System.out.println(map.get(102));


        



    }
}
