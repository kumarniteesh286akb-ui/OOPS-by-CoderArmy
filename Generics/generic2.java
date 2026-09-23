package Generics;

public class generic2 {
    public static void main(String[] args) {
        Pair <String,Integer> p1 = new Pair<>("Niteesh",23);
        System.out.println(p1.first +","+p1.second);
    }
}
class Pair<T,U>{
 T first;
 U second;
 Pair(T first,U second){
     this.first = first;
     this.second = second;
 }
}