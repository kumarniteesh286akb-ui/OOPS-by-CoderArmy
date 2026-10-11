package Multithreading;

public class CreatingOfThread {
	void main(){
Mythread t1 = new Mythread();
t1.start();
	}
}
//Thread class extended
class Mythread extends Thread{
	@Override
	public void run(){
		System.out.println("Thread is running");
	}
}