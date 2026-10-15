package FileHandling;

import java.io.*;

public class Main {
	void main(){
			File file = new File("Output.csv");
		try{
			if(file.createNewFile()){
				System.out.println("File created successfully");

			}
		else {
				System.out.println("File already exists....");
			}

		}
		catch (Exception e ){
			System.out.println("Something Error has been occurred....");
			e.printStackTrace();
		}

		ReadFile(file);
		filedelete(file);













	}



	void filedelete(File file){
		try{
		if(file.delete()){
			System.out.println("File has been deleted....");
		}else {
			System.out.println("File has not been deleted....");
		}
		}catch (Exception e ){
			e.printStackTrace();
		}
	}


	void ReadFile(File file ){
		try(BufferedReader br = new BufferedReader(new FileReader("Output.csv"))){
			String line=br.readLine();
			while(line  != null){
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Error reading the File.....");
		}
	}





}
