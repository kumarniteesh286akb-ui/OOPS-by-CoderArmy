package ExceptionHandling;

public class NestedTryCatch {
	void main(){
		try{

			//Inner try handles its exceptions
			System.out.println("Outer try starts...");
			try {
				System.out.println("Inner try starts....");

				System.out.println(5 / 0);//new Arithmetic exception

				System.out.println("Inner try starts....");
			}
			catch (ArithmeticException e ){
				System.out.println("Divide by zero is not allowed : inner");
			}
		}
		catch (Exception e) {
				System.out.println("Divide by zero is not allowed :Outer");
		}
	}
}
