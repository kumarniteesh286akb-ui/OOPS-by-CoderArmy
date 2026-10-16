package ProblemOfMultiThreading;

public class RaceCondition {
	void main() throws InterruptedException{
		counter c1 = new counter();
		Thread t1 = new Thread(()->{
			for(int i = 0;i<1000;i++) {
				c1.increment();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i = 0 ;i<10000;i++) {
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
	void increment(){
		count++;
	}
}
//In this code the increment method is shared resource and for that and which is known as the critical section of this

//there is the race condition between the thread t1 and t2 and this will not give the desired answer...