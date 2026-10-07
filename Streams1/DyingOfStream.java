package Streams1;
import java.util.*;
import java.util.stream.*;

public class DyingOfStream {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>(List.of(5,17,24,14));
//		Stream<Integer> s = list.stream();
//		s=s.filter(x->x>10);
//		s=s.map(x->x*2);
//		List<Integer> result = s.toList();
//		result.forEach(System.out::println);


		list.stream()
				.filter(x->x>10)
				.map(x->x*2)
				.forEach(System.out::println);



		//Now we can not use the list.stream as it has hit the one terminal condition.....




		//Creating the streams
		//By Arrays
String[] arr = {"Niteesh","Kumar","Nimrit","Arya"};

//Arrays.stream(arr)



	}
}
