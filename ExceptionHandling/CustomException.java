package ExceptionHandling;

public class CustomException {
	void main(){
			try{
				checkEligibility(-5);
			}
			catch(InvalidAgeException e){
				System.out.println(e.getMessage());
			}
	}
	 void checkEligibility(int age ) throws InvalidAgeException {
		
		if (age < 0) {
			throw new InvalidAgeException("Age can not be negative...");
		}
		if (age > 18) {
			System.out.println("You are eligible for the vote");
		}
		if (age >= 0 && age <= 18) {
			System.out.println("You are not eligible to the vote.....");
		}
	}
}
class InvalidAgeException extends RuntimeException{
public InvalidAgeException(String message){
	super(message);
}
}
