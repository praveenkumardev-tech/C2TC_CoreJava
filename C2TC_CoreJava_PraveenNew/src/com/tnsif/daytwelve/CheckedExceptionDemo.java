package com.tnsif.daytwelve;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String str = CheckedException.acceptText();//reads line from close
			System.out.println("Your string is "+ str);
		}catch(IOException e) {
			System.err.println("An error occured while reading input: " + e.getMessage());
		}
	}

}
