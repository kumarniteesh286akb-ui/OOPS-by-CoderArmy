package ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
	void main(){
		//Executor FrameWork

		ExecutorService executor = Executors.newFixedThreadPool(2);


		//Number of the tasks = 5

		for(int i=0;i<5;i++){
			int taskId = i;
			executor.execute(()->{
				System.out.println("Task "+ taskId +" is performed by : "+Thread.currentThread().getName());
			});
		}
		executor.shutdown();


	}
}
