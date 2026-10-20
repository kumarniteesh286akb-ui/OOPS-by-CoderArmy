package LockFreeConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class LockFreeConcurrency {
	void main(){
	Counter counter = new Counter();
	Thread t1 = new Thread(()->{
		for (int i = 0 ;i<10000;i++){
			counter.increment();
		}
	});
	Thread t2 = new Thread(()->{
		for (int i = 0 ;i<10000;i++){
			counter.increment();
		}
	});


	t1.start();
	t2.start();

	try{
		Thread.sleep(2000);
	}catch (Exception e){}
		System.out.println(counter.count);

	}
}



//AtomicInteger
class Counter {
//	volatile int count = 0 ;
AtomicInteger count = new AtomicInteger(0);

	void increment(){
		count.incrementAndGet();
	}
}