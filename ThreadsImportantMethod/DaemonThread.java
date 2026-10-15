package ThreadsImportantMethod;

public class DaemonThread {
	void main(){
		Thread t1 = new Thread(()->{
			while(true){
				System.out.println("Running.....");
			}
		});
		t1.setDaemon(true);
		t1.setPriority(10);
		t1.start();
		//making the demon Threads
		try{
			Thread.sleep(1);
		}catch (Exception e){}
		System.out.println("Stopping the main Thread...");
	}
}
