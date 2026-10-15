package ThreadsImportantMethod;

public class JoinMethod {
	void main() throws InterruptedException{
		System.out.println("Main thread Starts.....");

		Thread t1 = new Thread(()->{
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e){
				System.out.println("An error occurred...");
			}
			System.out.println("Thread -0 starts...");
		});
		t1.start();
		//t1.join();//let the t1 thread first complete its execution
		t1.join(1000);
		System.out.println("Main thread ends......");

	}
}
