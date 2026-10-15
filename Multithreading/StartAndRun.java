package Multithreading;

public class StartAndRun {
	void main(){
		Thread t1 = new Thread(()-> {
			System.out.println("Current thread is " + Thread.currentThread().getName());


		});
//		t1.start();
		t1.run();
	}
}
// can we start the same thread again?
//Ans-> NO,we can not initialize the same thread again