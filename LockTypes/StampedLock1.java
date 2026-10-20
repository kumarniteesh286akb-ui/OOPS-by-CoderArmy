package LockTypes;
import java.util.concurrent.locks.StampedLock;

public class StampedLock1 {
	void main(){
			SharedResource1 sr = new LockTypes.SharedResource1();
			Thread r1 = new Thread(sr::read);
			Thread r2 = new Thread(sr::read);
			Thread r3 = new Thread(sr::read);
			Thread r4 = new Thread(sr::read);



			Thread w1 = new Thread(()->sr.write(12));
			Thread w2 = new Thread(()->sr.write(13));
			Thread w3 = new Thread(()->sr.write(14));
			r1.start();
			r2.start();
			r3.start();
			r4.start();


			w1.start();
			w2.start();
			w3.start();




	}
}
	class SharedResource1{
		private int value = 0;
		StampedLock lk = new StampedLock();


		public int read (){
			long stamp = lk.tryOptimisticRead();
			int currentValue = value;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}



			if(!lk.validate(stamp)){
				//Fall over logic
				//try pessimistic read
				stamp = lk.readLock();
				try{
					currentValue = value;
				}finally {
					lk.unlock(stamp);
				}
			}
			System.out.println(Thread.currentThread().getName()+"reads value as : ");
			return currentValue;

		}


		public void write(int newValue) {

			long stamp = lk.writeLock();

			try {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}

				value = newValue;

				System.out.println(
						Thread.currentThread().getName() + " changes value to " + value
				);

			} finally {
				lk.unlockWrite(stamp);
			}
		}
	}
