package MonitorLocks;

public class StaticSynchronization {
	void main(){


		Thread t1 = new Thread(Counter::increment);



		Thread t2 = new Thread(Counter::increment);

		t1.start();
		t2.start();


	}
}
class Counter{
	static int count = 0 ;//After using synchronize with the static this locks the class not the object.....
	synchronized static void increment(){
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		count++;
		System.out.println(count);
	}
}


