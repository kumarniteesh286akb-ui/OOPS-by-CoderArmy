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
		System.out.println(name.orElseGet(() -> "Unknown"));
		name.ifPresentOrElse(System.out::println, () -> System.out.println("Unknown"));
//		System.out.println(name.orElseThrow());//We are intentionally want to throw  the exception to the output



		Optional<User> user = getUser();
//		if(user != null){
//			Address address = user.address;
//			if(address != null){
//				String city = address.city;
//				if(city != null){
//					System.out.println(city);
//				}
//			}
//		}

		user.map(x->x.address)
				.map(y->y.city)
				.ifPresent(System.out::println);







	}

	public static Optional<String> getName() {
		return Optional.ofNullable(null);
//return Optional.empty();








	}

	private static Optional<User> getUser() {
		Address a = new Address();
		a.city = "Delhi";

		User u = new User();
		u.address = a;
		return Optional.of(u) ;
	}
}



class User{
	public Address address;
}
class Address{
	public String city;
}

