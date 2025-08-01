package com.tnsif.daynine;

public class SampleStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Simple String Operations
		char c[] = {'I', 'n', 'd', 'i', 'a'};
		String s1 = new String(c);
		String s2 = new String(s1);
		System.out.println(s1);
		System.out.println(s2);
		
		//Using Concatenation to prevent long lines.
		String longstr = "This is show " + "how string concatenation " + "can happen with addition " + "operation.";
		System.out.println(longstr);
	}

}
