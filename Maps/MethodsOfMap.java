package Maps;

import java.util.HashMap;
import java.util.*;

public class MethodsOfMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Niteesh");
        map.put(102,"Kumar");
        map.put(103,"Bewkoof");
        map.put(104,"Nimrit");
        map.put(105,"Arya");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue("Niteesh"));
        System.out.println(map.put(103,"Abhay"));

        System.out.println(map);
        System.out.println(map.get(103));
        map.remove(103);
        System.out.println(map);

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(103,"Nimrit");
        map.putAll(map2);
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.containsKey(102));
        System.out.println(map.values());
        System.out.println("The value of the set using the entry set....");
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        System.out.println(entries);
        System.out.println("This is the default method of the get or default...");
        System.out.println(map.getOrDefault(106,"Default value"));

        System.out.println(map.putIfAbsent(103,"Niteesh"));

        Set<Map.Entry<Integer,String>>entries1 = map.entrySet();
        for(Map.Entry<Integer,String> entry: entries1){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }



    }
}
