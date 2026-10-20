package InterThreadCommunication;

public class WaitNotify{
	void main() {
		Resource r1 = new Resource();
		Thread t1 = new Thread(()->{
			for(int i = 0 ;i <= 20 ;i++){
				try{
					Thread.sleep(100);
				r1.producer(i);
				}
				catch (Exception e ){}
			}
		});


		Thread t2 = new Thread(()->{
			for (int i = 0 ;i<=20;i++){
				try{
					Thread.sleep(100);
				r1.consumer();
				}
				catch (Exception e){}
			}
		});

		t1.start();
		t2.start();
	}
}
class Resource{
	volatile Integer item ;
	volatile boolean flag;
	synchronized void producer(int value) throws InterruptedException{
		while(flag){
		wait();//when a thread comes out of the WAITING QUEUE then it goes to the blocked state as it have to acquire the monitor locks again.....
		}
		item = value;
		flag = true;
		notify();
		System.out.println("Producer produces : "+item);
	}

	synchronized void consumer() throws InterruptedException{
		while(!flag){
			wait();
		}
		System.out.println("Consumer consumes : "+item);
		item = null;
		flag = false;
		notify();
	}



}