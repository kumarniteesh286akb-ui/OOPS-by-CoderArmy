package Multithreading;

public class ThreadIdAndName {
	void main(){
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		Thread t1 = new Thread(()-> {
		 System.out.println("Name of the my thread is "+ Thread.currentThread().getName());
			System.out.println("The id of the thread is "+Thread.currentThread().getId());
		});
		t1.start();
		Thread t5 = new Thread(()-> {
			System.out.println("Name of the my thread2 is "+ Thread.currentThread().getName());
			System.out.println("The id of the thread2 is "+Thread.currentThread().getId());//get id is deprecated method in the java and this will be disappeared in modern java updates
		});
		t5.start();
	}
}



