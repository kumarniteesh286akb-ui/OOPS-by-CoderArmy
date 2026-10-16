package MonitorLocks;

public class SynchronisedDeep {
	void main(){
		test tes = new test();
		test tes2 = new test();
		Thread t1  = new Thread(tes::m1);
		Thread t2 = new Thread(tes::m2);//If we use the tes2 then the both the locks will be acquired by the both the threads...
//		WE are using the synchronized word on tes--->as if one thread acquire the lock of this then that should have to finish the work completely
//		The synchronize word makes the lock to the object level as we are calling the two threads on the same object then only one thread at a time can acquire the lock and should have to finish its work then the other lock will be acquired by the another lock

t1.start();
t2.start();

	}
}
class test{
	synchronized void m1(){
		System.out.println("M1 entered...");
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Exception....");
		}
		System.out.println("M1 exited...");
	}


	synchronized void m2(){
		System.out.println("M2 entered...");
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Exception....");
		}
		System.out.println("M2 exited...");
	}

}