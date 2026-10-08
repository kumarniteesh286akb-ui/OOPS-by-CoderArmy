package Streams1;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
	Optional<String> name = getName();
//	if(name.isPresent()){
//		System.out.println(name.get());
//	}
//		System.out.println(name.get());
//name.ifPresent(System.out::println);
		System.out.println(name.orElse("Niteesh"));
		System.out.println(name.orElseGet(()->"Unknown"));
		name.ifPresentOrElse(System.out::println,()-> System.out.println("Unknown"));
		System.out.println(name.orElseThrow());//We are intentionally want to throw  the exception to the output

	}
public static Optional<String> getName(){
		return Optional.ofNullable(null);
//return Optional.empty();
	}
}
