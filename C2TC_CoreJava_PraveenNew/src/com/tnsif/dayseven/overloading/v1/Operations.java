package com.tnsif.dayseven.overloading.v1;

public class Operations {
	
	//check whether number is palindrome or not?
	public static boolean isPalindrome(int number) {
	int rev = 0;
	int dummyNumber = number;
		while (number != 0) {
			rev = rev*10 + number%10;
			number /= 10;
		}
	return dummyNumber==rev;
	}
	
	//check whether string is palindrome or not?
	public static boolean isPalindrome(String str) {
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}
}
