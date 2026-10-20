package LockFreeConcurrency;
import java.util.concurrent.atomic.AtomicReference;

public class SeatBookingProblem {
	void main(){
		SeatBooking sb = new SeatBooking();
		Thread t1 = new Thread(()->{
			boolean value = sb.bookseat("Niteesh");
			System.out.println("T1 says : "+value);
		});
		Thread t2 = new Thread(()->{
			boolean value = sb.bookseat("Nimrit");
			System.out.println("T2 says : "+value);
		});


		t1.start();
		t2.start();
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e){

		}
		System.out.println(sb.seat);

	}
}
class SeatBooking{
//	String seat = new String("EMPTY");
AtomicReference<String> seat = new AtomicReference<>("EMPTY");

//	boolean bookSeat(String name){
//		if(seat.equals("EMPTY")){
//			seat = new String(name);
//			return true;
//		}
//		return false;
//	}




	//Compare and set (CAS)
	boolean bookseat (String name){
		String currentValue= seat.get();
		if(!currentValue.equals("EMPTY")){
			return false;
		}
		//if(seat.equals("Empty")
//		seat = new String(name);
//		return true;

		 return seat.compareAndSet("EMPTY",name);

	}




}