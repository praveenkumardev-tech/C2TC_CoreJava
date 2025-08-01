package dayeleven.v1;

public class NestedTryBlockEx {
	public static int divide(int x, int y) {
		int z = 0;
		z = x/y;
		System.out.println("Result of divison is z: " + z);
		return z;
	}
	public static void main(String[] args) {
		int x, y, z;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			try {
				z = divide(x, y);
			}catch(ArithmeticException ae) {
				System.out.println("Error! A number  cannot be divide by 0");
			}
		}catch(NumberFormatException e) {
			System.err.println("Error! please pass numbers ");
		}
		System.out.println("Iam out of outer catch block");
	}
}
