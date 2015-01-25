package ReadingAndWritingFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Creating_Reading_Writing_Textfiles {

	public static void main(String[] args) throws IOException {
		
		//Creating a new file
		//File is an inbuilt class
		//Creating an object for file class
		File f=new File("D:\\Application\\Aishwarya_Selenium\\General\\Files.txt");
		f.createNewFile();
		
		//Writing a new file
		FileWriter w=new FileWriter("D:\\Application\\Aishwarya_Selenium\\General\\Files.txt");
		BufferedWriter out=new BufferedWriter(w);
		out.write("Hello we are writing in a file");
		out.newLine();
		out.write("Writing in a new line");
		out.flush();
		
		//Reading from the file
		FileReader fr=new FileReader("D:\\Application\\Aishwarya_Selenium\\General\\Files.txt");
		BufferedReader br=new BufferedReader(fr);
		String x=" ";
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		
		while((x=br.readLine())!=null){
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
	}

}
