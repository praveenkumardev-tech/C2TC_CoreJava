package daytwelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	static String acceptText() throws IOException{
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter the String: ");
			String str = br.readLine();
			//br.close(); The BufferReader will be closed automatically when the try
			//block is exited, regardless of whether an exception is thrown or not.
			return str;
				
		}
	}
}

