package ExecutorFrameWork;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
	void main(){
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2));

		for(int i = 0;i<5;i++){
			int taskId = i;
			executor.execute(()->{
				System.out.println("Task "+taskId+" is performed by "+Thread.currentThread().getName());
				try{
					Thread.sleep(2000);
				}catch (Exception e){}
			});
		}

		executor.shutdown();
	}
}
