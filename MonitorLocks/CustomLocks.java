package MonitorLocks;

public class CustomLocks {
	void main(){
		Bank b1 = new Bank();
		Thread t1 = new Thread(b1::deposit);
		Thread t2 = new Thread(b1::withDraw);
		t1.start();
		t2.start();
	}
}
class Bank{
	Object lock1 = new Object();
	Object lock2 = new Object();
	void M1(){
		synchronized (new Object()){
			System.out.println(Thread.currentThread().getName()+"Entered m1");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName()+"Exiting m1");
		}
	}
//	Interview Question ----> In this case the lock will be acquired by both thread as it is making the new objects everytime for the locking of the objects...
//	So there is no use of Synchronised word in this block of the code as it would be normally run as both thread can enter this easily at the same time and can do operation at the same time....




	void deposit(){
		synchronized (lock1) {
			System.out.println("Deposit logic....");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}
	 void withDraw(){
		synchronized (lock2) {
			System.out.println("WithDraw logic....");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}
}
// If we do not use the custom locks to the different objects then we would be unable to perform the operation independently as if a thread enters then that thread have to complete its task fully....
