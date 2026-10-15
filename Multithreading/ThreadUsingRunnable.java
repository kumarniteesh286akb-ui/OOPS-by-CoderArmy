package Multithreading;

public class ThreadUsingRunnable {
	void main(){
		Thread t1 = new Thread(()-> System.out.println("Thread is running....."));
		t1.start();

	}
}
//class MyRunnable implements Runnable{
//	@Override
//	public void run(){
//		System.out.println("Thread using the runnable....");
//	}
//}