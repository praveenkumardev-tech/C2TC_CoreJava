package com.tnsif.dayeleven.multiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iam in main Method");
		int numberOne, numberTwo, numberThree;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		while(true) {
			try {
				numberOne = sc.nextInt();
				numberTwo = sc.nextInt();
				numberThree = numberOne / numberTwo;
				System.out.println("Division is" + numberThree);
				break;
			}catch(InputMismatchException e) {
				//e.printStackTrace();
				System.out.println("Invalid input. Please enter Integers Only.");
				sc.nextLine();
			}catch(ArithmeticException e) {
				System.out.println("Exception caught: " + e.getMessage());
				break;
			} catch(Exception e) {
				System.out.println("Exception caught: "+ e.getMessage());
				break;
			}
		}
		sc.close();
	}

}
