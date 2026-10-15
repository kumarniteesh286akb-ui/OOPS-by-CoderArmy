package ThreadsImportantMethod;

public class CurrentThreadMethod {
	void main(){
		Thread t1 = new Thread(()->{
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setName("Worker 1");
			System.out.println(Thread.currentThread().getName());
		});
		t1.start();
	}
}
