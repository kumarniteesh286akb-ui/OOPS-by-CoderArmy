package Multithreading;

public class ExcutionOrder {
	void main(){
		//1 to 100 (Even numbers)
		Thread t1 = new Thread(()->{
			for(int i = 0;i<100;i+=2){
				System.out.println("t1 : "+i+"  ");
			}
		});
		System.out.println();

		//1 to 100 (Odd numbers)
		Thread t2 = new Thread(()->{
			for(int i = 1 ;i<100;i+=2){
				System.out.println("t2 : "+i+"  ");
			}
		});
t1.start();
t2.start();

	}
}
//Execution Order ----> Non-determinism(There is the context switching and parallel execution)
//This will be totally depend on the system load,Hardware and Thread Creation time(OS will decide all the things ) cpu Scheduling.....
