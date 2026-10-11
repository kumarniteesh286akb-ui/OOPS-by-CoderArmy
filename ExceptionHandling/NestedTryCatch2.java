package ExceptionHandling;

public class NestedTryCatch2 {
	void main(){
//		outer catch will handle its exceptions
		try{
			System.out.println("Outer try starts...");
			try {
				System.out.println("Inner try starts....");

				System.out.println(5 / 0);//new Arithmetic exception

				System.out.println("Inner try starts....");
			}
			catch (NullPointerException e ){
				System.out.println("Nulls are not allowed...");
			}
			System.out.println("Outer try ends ......");
		}
		catch (Exception e) {
			System.out.println("Divide by zero is not allowed :Outer");
		}
	}
}
