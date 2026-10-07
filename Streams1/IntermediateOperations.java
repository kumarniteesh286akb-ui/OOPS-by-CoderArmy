package Streams1;

import java.util.*;
import java.util.stream.Stream;

public class  IntermediateOperations{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(1,2,21,21,45,67,45,67));
		list.stream()
				.filter(x->x>10)
//				.filter(x -> x%2 ==0)
				.map(x -> x*2)
				.distinct()//This will stop all the duplicates and this method is the stateful as it collects all the elements of the stream and would process it , it would remain the vertical process
				.forEach(System.out::println);
		System.out.println("This is the use of the flatmap ");
List<List<Integer>> list2 = List.of(
		List.of(1,8),
		List.of(2,4)
);
	list2.stream()
			.flatMap(x ->x.stream())
			.map(x ->x*2)
			.sorted((a,b)->b-a)//This method is stateful as it is processed as the vertical process
//			This will collect all the values and will compare all the things of the stream
			.forEach(System.out::println);

//Skip and limit values

		Stream.iterate(1.0,x->Math.pow(x,2))
				.limit(10)//This would perform the operation of iterate 4 times
				.peek(System.out::println)
				.skip(2)//This would skip the first n process of the limit / functions
				.forEach(System.out::println);





	}
}
