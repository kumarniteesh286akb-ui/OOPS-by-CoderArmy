package Lambdas;

import java.util.function.Consumer;

public class ConsumerChaining {
	public static void main(String[] args) {
	//print{String}
		Consumer<String> printName = System.out::println;
		Consumer<String> printUpperCase = s-> System.out.println(s.toUpperCase());

		Consumer<String> pipeline = printName.andThen(printUpperCase);

		pipeline.accept("Niteesh");




	}
}
