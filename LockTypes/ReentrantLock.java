package LockTypes;

import java.util.concurrent.locks.Lock;

public class ReentrantLock {
void main(){
		Resource r1 = new Resource();
		Thread t1 = new Thread(r1::f1);
		Thread t2 = new Thread(r1::f1);
		Thread t3 = new Thread(r1::f1);
		t1.start();
		t2.start();
		t3.start();
		}
}
class Resource{
	Lock lock = new java.util.concurrent.locks.ReentrantLock();
	void f1(){
		lock.lock();
		try{
			System.out.println(Thread.currentThread().getName()+"Entered....");
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"Exited.....");
		}finally {
			lock.unlock();
		}

	}
}