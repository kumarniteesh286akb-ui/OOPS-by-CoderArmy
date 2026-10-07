package IterableInterfaces;
import java.util.*;
public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(24);
        list.add(23);
        list.add(23);
        list.add(23);

        Iterator <Integer> it = list.iterator();
        while(it.hasNext()){
            int value = it.next();
            if(value==24){
                list.remove(value);
            }
            System.out.println(value);
        }
    }
}
//concurrent modification Exception--> fast fail
