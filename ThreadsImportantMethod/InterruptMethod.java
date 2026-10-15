package ThreadsImportantMethod;

public class InterruptMethod {
	void main() throws InterruptedException{
Thread t1 = new Thread(()->{
	while(!Thread.currentThread().isInterrupted()){
		System.out.println("Running....");
	}
});


t1.start();
Thread.sleep(20);//We are making the main thread to stop for 20 milliseconds
		System.out.println("The interrupt method is called .....");
		t1.interrupt();
	}
}
//t1.interrupt--> sends a signal to t1 thread that it should stop doing what its doing....
//WE can gracefully handle this
//---> You can make a thread run until a condition
//-----> cancelling a long-running task
//------>Used to stop the thread pool


// isInterrupted()----> return interrupt flag value(T/F)

//interrupt --->return interrupt flag value (T/F) but also set it back to false




