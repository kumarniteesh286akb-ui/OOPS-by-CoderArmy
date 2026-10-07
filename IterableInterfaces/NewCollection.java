package IterableInterfaces;

import java.util.Iterator;

public class NewCollection {
    public static void main(String[] args) {
        String [] names = {" Niteesh","Aryan","Kumar"};
        NameContainer nm = new NameContainer(names);
        Iterator<String> it =nm.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class NameContainer implements Iterable<String>{
     private String[] names;
     private int size;
     NameContainer(String [] names ){
    this.names = names;
    this.size = this.names.length;
    }
    @Override
    public Iterator<String>iterator(){
         return new NameContainerIterator();
    }


    private class NameContainerIterator implements Iterator<String>{
         int pos = 0;
         @Override
        public boolean hasNext(){
        return pos<size;
         }
         public String next(){
             return names[pos++];
         }


    }

}