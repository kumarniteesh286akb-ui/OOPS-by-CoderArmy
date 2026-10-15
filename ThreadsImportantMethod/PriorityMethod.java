package ThreadsImportantMethod;

public class PriorityMethod {
	void main(){
		Thread t1 = new Thread(()->{
			System.out.println("Custom Thread is running....");
		});
		Thread t2 = new Thread(()->{
			System.out.println("This is the second thread....");
		});
		t1.start();
		t1.setPriority(10);
		t2.start();
		System.out.println(t2.getPriority());
		t1.setPriority(1);
		System.out.println(t2.getPriority());
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	}
}
