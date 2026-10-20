package LockFreeConcurrency;

import java.util.concurrent.atomic.AtomicReference;

public class LockFreeReTryLoop {
	void main(){
	LikeCounter likeCounter = new LikeCounter();
	Thread t1 = new Thread(likeCounter::like);
	Thread t2 = new Thread(likeCounter::like);
	Thread t3 = new Thread(likeCounter::like);
	Thread t4 = new Thread(likeCounter::like);
	Thread t5 = new Thread(likeCounter::like);
	Thread t6 = new Thread(likeCounter::like);
	Thread t7 = new Thread(likeCounter::like);
	Thread t8 = new Thread(likeCounter::like);
	Thread t9 = new Thread(likeCounter::like);
	Thread t10 = new Thread(likeCounter::like);


	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
	t8.start();
	t9.start();
	t10.start();


	try{
		Thread.sleep(2000);
	}catch (InterruptedException e){}


		System.out.println("Total like are :" + likeCounter.getTotalLikes());
	}
}
class LikeCounter{
	AtomicReference<Integer> totalCount = new AtomicReference<>(0);
	public void like(){
		Integer currentCount;
		Integer finalCount;
//		totalCount.set(totalCount.get()+1); There can be         the race condition as they are different atomic          operations
		while(true) {
		//1.We will capture the latest value of the totalCount

		 currentCount = totalCount.get();

		//2. Increment like counter by 1
		finalCount = currentCount + 1;

		//3. check again if the count is still what I saw
		if(totalCount.compareAndSet(currentCount
				, finalCount)){
			return;
		}
			System.out.println("conflict detected retry");

		}
	}
	public int getTotalLikes(){
		return totalCount.get();
	}
}