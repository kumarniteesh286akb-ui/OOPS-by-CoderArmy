package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UseofThrows {
	void main()  throws FileNotFoundException{
//		try {
//			readFile();
//		}
//		catch(FileNotFoundException e){
//			System.out.println("File not Found....");
//		}
		readFile();
	}

 void readFile() throws FileNotFoundException{
		FileReader fr = new FileReader("abc.txt");
	}
}
