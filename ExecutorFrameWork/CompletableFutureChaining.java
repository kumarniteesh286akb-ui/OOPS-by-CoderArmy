package ExecutorFrameWork;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureChaining {
void main(){
//	CompletableFuture<Integer> f1 =
//			CompletableFuture.supplyAsync(()->10)
//					.thenApply(x->x*2)
//					.thenApply(result->result*3);

	CompletableFuture<Void> f1 =
			CompletableFuture.supplyAsync(()->10)
//					.thenAccept(System.out::println);
					.thenRun(()-> System.out.println("Done"));


	CompletableFuture<Integer> f2 =
			CompletableFuture.supplyAsync(()->10);
	CompletableFuture<Integer> f3 =
			CompletableFuture.supplyAsync(()->20);
	CompletableFuture<Void> result = f2.thenCombine(f3,(a,b)-> a+b)
			.thenAccept(System.out::println);





	try{
		System.out.println(f1.get());
	}catch(Exception e ){
		System.out.println("This is the try catch block");
	}
}
}
//Fork-Join Pool executor