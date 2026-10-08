package Streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(1,2,21,21,45,67,45,67));
//		List<Integer> list2 = list.stream()
//				.map(x -> x+1)
////				.toList();//This is the immutable list
//		.collect(Collectors.toList());
//		list2.add(121232);
//		System.out.println(list2);



		 long sum = list.stream()
//				.reduce(269,(a,b)->a+b);
		.count();
		System.out.println(sum);

	}
}
