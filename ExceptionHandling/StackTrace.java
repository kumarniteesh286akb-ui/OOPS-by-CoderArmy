package ExceptionHandling;

public class StackTrace {
	void main(){
		int a = 5;
		int b = 0;
		methodA(a,b);
	}
	static void methodA(int a , int b ){
		methodB(a,b);
	}
	static void methodB(int a ,int b){
		System.out.println(a/b);
	}
}
