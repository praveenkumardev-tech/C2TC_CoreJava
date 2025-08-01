package dayeleven.v1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number: ");
			int number = sc.nextInt();
			System.out.println(number % 2 == 0 ? number + " is Even" : number + " is Odd");
			return;
		}catch(InputMismatchException e){
			System.err.println("Invalid Input...");
		} finally {
			System.out.println("In Finally...");
			sc.close();
		}
	}
}
