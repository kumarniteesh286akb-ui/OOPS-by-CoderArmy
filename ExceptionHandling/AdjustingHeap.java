package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class AdjustingHeap {
	void main(){
		List<int[] > list = new ArrayList<>();

		int count = 0;
		while(true){
			list.add(new int[250000]);
			count++;
			System.out.println("Allocated Block: " +count);
		}

	}
}
//Run This program with terminal and give the commands as follows either this will be infinite loop and this would full the memory of your pc
//commands
//1.javac AdjustingHeap.java
//2. java -Xms2m -Xmx4m java AdjustingHeap

