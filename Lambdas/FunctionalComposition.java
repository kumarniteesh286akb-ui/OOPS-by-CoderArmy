package Lambdas;

import java.util.function.*;

public class FunctionalComposition {
	public static void main(String[] args) {
//  (x+2)*3---> x+2,X+3;
		//Function<Integer,Integer> equation = x->((x+2)*3);

		Function<Integer,Integer> add2 = x->(x+2);
		Function<Integer,Integer> multiply3 = x->(x*3);
		Function<Integer,Integer> divide3 = x->(x/2);
		int a = add2.apply(2);
		int b = multiply3.apply(a);
		int ans = multiply3.apply(add2.apply(2));
		// g(f(x));





		int ans2 = add2.andThen(multiply3).apply(2);
		int ans3 = add2.andThen(multiply3).andThen(divide3).apply(3);
		System.out.println(ans);
		System.out.println(ans2);
		System.out.println(ans3);





	}
}
