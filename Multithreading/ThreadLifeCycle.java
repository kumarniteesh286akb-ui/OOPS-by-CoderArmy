package Multithreading;

public class ThreadLifeCycle {
	void main(){
//		 Thread creation stage
		Thread mainThread = Thread.currentThread();
		//New Stage
		Thread t1 = new Thread(()->{
			System.out.println("Name of the current thread is "+Thread.currentThread().getName());
			System.out.println("Main thread state "+mainThread.getState());
		});
		System.out.println(t1.getState());


		//Runnable State
		t1.start();//This is running after the get state as this takes the time to be executed
		System.out.println(t1.getState());
		try {
			System.out.println();
			Thread.sleep(2000);
		}catch (Exception e){
			System.out.println("Thread is unable to sleep");
		}
		System.out.println(t1.getState());//Terminated
	}
}
