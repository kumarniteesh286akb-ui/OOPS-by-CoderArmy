package ExceptionHandling;

public class RuntimeException1 {
	void main(){
		try{
//			System.out.println(5/0);
			String s = null;
			s.length();
		}
//		catch (Throwable e){// we do not use the throwable class as it also catches the errors and which is dangerous for us ...
		catch (ArithmeticException a ){
			System.out.println("Arithmetic exception has been done ....");
		}
		catch (NullPointerException e ){
			System.out.println("Nulls are not allowed in this line of the code");
		}
		catch (Exception e ){
			System.out.println("Caught by the Exception...");
		}
	}
}
