package GenericsDeepDive;

import java.util.LinkedList;
import java.util.List;

public class TypeErasures {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
    }
}
//if notBounded -> Replace with Objects
//if Bounded -> Replace with the Bounding values
//Insert the casting automatically