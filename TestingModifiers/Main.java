package TestingModifiers;
import UnderstandingAccessModifiers.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cat = new ArrayList<>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
Property(cat);
    }
    public static  void Property(@org.jetbrains.annotations.NotNull List<? extends Cat> values){
        for(Cat d :values){
            d.drink();
            d.eat();
        }
    }
}
