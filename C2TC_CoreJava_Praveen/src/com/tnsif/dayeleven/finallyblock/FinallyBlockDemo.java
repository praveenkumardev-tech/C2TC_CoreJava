package dayeleven.finallyblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number: ");
			int number = sc.nextInt();
			System.out.println(number % 2 == 0 ? number + " is Even" : number + " is Odd");
		}catch(InputMismatchException e) {
			System.out.println("Invalid Input....");
		}finally {
			System.out.println("In Finally....");
			sc.close();
		}
	}

}
