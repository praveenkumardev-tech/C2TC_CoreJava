package day3.userinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		
		//Used to load the class into the resource link
		URL resource = FileReaderDemo.class.getResource("MVIT_TNS.txt");
		
		if(resource == null) {
			System.err.println("File not found");
		}
		
		//converting URL into file object
		File f = new File(resource.getFile());
		
		
		//Object Creation of the file reader
		FileReader fr = new FileReader(f);
		
		//object creation for buffer reader
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		while((line = br.readLine()) != null)  {
			System.out.println(line);
		}
		br.close();
	}
}
