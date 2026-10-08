package Streams1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingStreams {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(1,2,21,21,45,67,45,67));

		List<Integer> s =list.stream()
				.map(x->x*2)
				.collect(Collectors.toList());
		System.out.println(s);

		Map<Boolean,List<Integer>> li = list.stream()
				.collect(Collectors.partitioningBy(x->x%2==0));
		System.out.println(li);


		List<String> list1 = new ArrayList<>(List.of("AA","BBB","CCCC","DD","EEE"));
		Map<Integer,String> map = list1.stream()
				.collect(Collectors.toMap(
						x->x.length(),
						x->x,
						(a,b)->b
				));
		System.out.println(map);

//		Map<Integer,List<String>> mp
String result	= list1.stream()
//						.collect(Collectors.groupingBy(x->x.length()));
//						.collect(Collectors.groupingBy(x->x.length(),
//						Collectors.mapping(
//								x->x.toLowerCase(),Collectors.toList())));




		.collect(Collectors.joining("-"));
		System.out.println(result);





	}
}
