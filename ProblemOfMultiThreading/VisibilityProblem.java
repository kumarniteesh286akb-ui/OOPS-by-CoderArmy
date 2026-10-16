package ProblemOfMultiThreading;

public class VisibilityProblem {
		static volatile boolean flag = false;
	void main(){
		Thread t1 = new Thread(()->{
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){}
			flag = true;//cache ---->flag = true;
		});



		Thread t2 = new Thread(()->{// cache --->flag =false;
//			it would always read the value from its cache and this would not read the value from the RAM....
			while(!flag){
//				System.out.println("Thread 2 is Running...");// this is the synchronized method for that
			}//After this the code will never be ended as it would not take the output of the at the end
			System.out.println("Thread 2 finished...");
		});//After using the volatile word it would read the value from the RAM



		t1.start();
		t2.start();

	}
}
