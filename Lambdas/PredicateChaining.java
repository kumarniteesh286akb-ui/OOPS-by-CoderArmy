package Lambdas;

import java.util.function.Predicate;

public class PredicateChaining {
	public static void main(String[] args) {
		Predicate<Integer> isGreater = x->x>100;
		Predicate<Integer> isEven = x->x%2==0;
		Predicate<Integer> isOdd = isEven.negate();
		System.out.println(isGreater.and(isEven).test(102));
		System.out.println(isGreater.or(isEven).test(10));

		Predicate<Students> isPassed = s->s.marks>=40;
		Predicate<Students> isAdult = s->s.age>=18;
		System.out.println(isAdult.and(isPassed).test(new Students(14,40)));



	}
}
class Students{
	int age;
	int marks;
	public Students(int age ,int marks){
		this.age = age;
		this.marks = marks;
	}
}
