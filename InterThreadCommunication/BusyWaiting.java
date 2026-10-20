package InterThreadCommunication;

public class BusyWaiting {
	void main(){
		box box1 = new box();
		Thread t1 = new Thread(()-> {
			for(int i = 0 ;i<=20;i++){
				box1.producer(i);
			}
		});


		Thread t2 = new Thread(()->{
			for(int i = 0 ;i<=20;i++){
				box1.consumer();
			}
		});


		t2.start();
		t1.start();
	}
}
class box{
	volatile Integer item;
	volatile Boolean flag = false;


	synchronized public void producer(int value){
		while(flag){
//			Do nothing
		}
		item = value;
		flag = true;
		System.out.println("Producer produces "+value);
	}

	synchronized void consumer(){
		while(!flag){
//			Do nothing
		}
		System.out.println("Consumer consumes "+item);
		flag = false;
	}
}
// Here there is the deadlock condition in which no output will come this code will not give any output
