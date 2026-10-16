package InterThreadCommunication;

public class ProducerConsumerProblem {
	void main(){
		Box box = new Box();
		Thread t1 = new Thread(()-> {
			for(int i = 0 ;i<=20;i++){
				box.producer(i);
			}
		});


		Thread t2 = new Thread(()->{
			for(int i = 0 ;i<=20;i++){
				box.consumer();
			}
		});


		t2.start();
		t1.start();
	}
}
class Box{
	Integer item;
	Boolean flag = false;


	public void producer(int value){
		item = value;
		flag = true;
		System.out.println("Producer produces "+value);
	}

	void consumer(){
		System.out.println("Consumer consumes "+item);
		flag = false;
	}



}
