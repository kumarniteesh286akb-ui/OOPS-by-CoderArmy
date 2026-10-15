package ThreadsImportantMethod;

public class SleepMethod {
	void main(){
		System.out.println("Main Thread Starts...");
		try{
			Thread.sleep(2000);
		}catch (Exception e ){
			System.out.println("Thread can not be gone to the sleep ....");
		}
		System.out.println("Main thread ends....");
	}
}
