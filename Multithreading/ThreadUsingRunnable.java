package Multithreading;

public class ThreadUsingRunnable {
	void main(){
		Thread t1 = new Thread(new MyRunnable());
		t1.start();

	}
}
class MyRunnable implements Runnable{
	@Override
	public void run(){
		System.out.println("Thread using the runnable....");
		System.out.println("This is the output of the csv file and this is the output");
		System.out.println("This is the output of the csv file and this is the output");
	}
}