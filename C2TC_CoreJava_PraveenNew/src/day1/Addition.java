package day1;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		
		System.out.println("The Addition of a = " + a + ", b = " + b + "and result is " + c );
	}
}
