package MonitorLocks;

public class SynchronisedWord {
	void main() throws InterruptedException{
		counter c1 = new counter();
		Thread t1 = new Thread(()->{
			for(int i = 0;i<10000;i++) {
				c1.increment();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i = 0 ;i<100000;i++) {
				c1.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c1.count);
	}
}
class counter{
	public int count = 0;
	synchronized void increment(){
		count++;// only one thread will enter at only one time and that thread have to complete process totally...
	}
}
