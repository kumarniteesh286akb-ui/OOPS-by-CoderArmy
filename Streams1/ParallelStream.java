package Streams1;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

	//Sequential Stream
//	list.stream()
//			.map(x->x*2)//StateLess
//		.peek(System.out::println)
//			.sorted((a,b)->b-a)
//			.filter(x->x>10)
//			.forEach(System.out::println);

//	Parallel Stream
list.parallelStream()
		.map(x->x*2)
		.forEach(System.out::println);
//		.forEachOrdered(System.out::println);






	}
}
