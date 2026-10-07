package Lambdas;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.*;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class InterfaceFunction {
	public static void main(String[] args) {
	Function<Integer,Integer> square = x->x*x;
//		System.out.println(square.apply(5));

		Consumer<Integer> Print = s-> System.out.println(s*s);
//		Print.accept(7);

		Supplier<Double> supply = ()->Math.floor(Math.random()*10);
//		System.out.println(supply.get());


		Predicate<Integer> IsEven = x->(x%2==0);
//		System.out.println(IsEven.test(8));


		//Iterable interface
		List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
//		for(Integer i : list){ 
//			System.out.println(i);
//		}
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"niteesh");
		map.put(2,"Kumar");

//		map.forEach((Key,value)-> System.out.println(Key + ":"+value));
		list.forEach(System.out::println);
		map.entrySet().forEach(System.out::println);




	}
}
