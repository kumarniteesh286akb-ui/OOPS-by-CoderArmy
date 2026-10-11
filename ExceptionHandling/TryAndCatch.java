package ExceptionHandling;

public class TryAndCatch {
	void main(){
		System.out.println("Step 1");
		try{
			int a = 5;
			int b = 0 ;
			System.out.println(a/b);
			//This block is used to write the risky code
		}
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();//This will give the output in the last because this uses the System.err.println

			// This is used to take the preventive measure and the handling code


		}
		finally {
//			This always runs....
			System.out.println("I would always be executed ... either the exception comes or not ....");
//			cleanup code (Optional)
//			resource close
//			to cut the connection from the database and to close the source which is remained open in the try block
//			 Logging

		}
		System.out.println("Step 2");
	}
}
