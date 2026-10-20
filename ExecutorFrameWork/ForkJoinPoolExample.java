package ExecutorFrameWork;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolExample {
	void main(){
		int [] arr = {1,3,4,54,5,5};
		ForkJoinPool pool = new ForkJoinPool();
		SumTask t1 = new SumTask(arr,0,arr.length-1);
		int result = pool.invoke(t1);
		System.out.println(result);
		pool.shutdown();
	}
}
//Fork Join pool executor
class SumTask extends RecursiveTask<Integer>{


	private int [] arr;
	private int start;
	private int end;
	public SumTask(int[] arr, int start, int end) {
		this.arr = arr;
		this.start = start;
		this.end = end;
	}
	@Override
	protected Integer compute(){
//Base condition
		if(end-start<=2){
			int sum = 0;
			for(int i = start ;i<=end;i++){
				sum+=arr[i];
			}
			return sum;
		}
//		Main logic
		int mid = (start+end)/2;
		SumTask leftTask=new SumTask(arr,start,mid);
		SumTask rightTask = new SumTask(arr,mid+1,end);
		leftTask.fork();
		int sum = rightTask.compute();
		int sum1 = leftTask.join();

//		join
		return sum+sum1;




	}
}