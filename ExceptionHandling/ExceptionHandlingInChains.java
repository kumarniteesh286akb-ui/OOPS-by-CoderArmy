package ExceptionHandling;

public class ExceptionHandlingInChains {
	void main(){
	 int a = 5 ;
	 int b = 0 ;
	 methodA(a,b);
	}
	static void methodA(int a , int b ){
		methodB(a,b);
	}
	static void methodB(int a ,int b){
		try{
		System.out.println(a/b);//Illegal -->new ArithmeticException("Message of the Jvm default");
	}catch (ArithmeticException e ){
			System.out.println("Exception handling is done in the method B");
			System.out.println("Division by zero is not allowed");
		}
	}

}
