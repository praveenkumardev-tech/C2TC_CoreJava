package dayeleven.v1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int startIndex, endIndex;
			String message, str;
			System.out.println("Enter the message");
			message =sc.nextLine();
			System.out.println("Enter the start index and end index: ");
			startIndex = sc.nextInt();
			endIndex = sc.nextInt();
			str = message.substring(startIndex, endIndex);
			System.out.println("The extracted message isL " + str);
		}catch(StringIndexOutOfBoundsException ae) {
			System.err.println("Error! Invalid index");
		}catch(InputMismatchException ae) {
			System.err.println("Error! Invalid Input ");
		}
	}

}
