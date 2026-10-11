package ExceptionHandling;

public class ThrowAndThrows {
	void main() {
//		try {
//			checkEligibility(18);
//		}
//		catch (IllegalArgumentException e ){
//			System.out.println(e.getMessage());
//		}
		checkEligibility( -12);
	}
	 void checkEligibility(int age ){
		try{
		if(age< 0){
			throw new IllegalArgumentException("Age can not be negative...");
		}
		if(age>18){
			System.out.println("You are eligible for the vote");
		}
		if(age>=0 &&age<=18){
			System.out.println("You are not eligible to the vote.....");
		}
			}
		catch(IllegalArgumentException e ){
			System.out.println(e.getMessage());
		}
	}
}
