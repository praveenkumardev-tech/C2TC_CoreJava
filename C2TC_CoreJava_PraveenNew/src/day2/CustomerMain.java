package day2;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		System.out.println(c1);
		
		Customer c2 = new Customer();
		c2.setCid(102);
		c2.setCname("Ramu");
		c2.setCity("Villiyanur");
		System.out.println(c2);
		
		System.out.println("Customer 1 city:" + c1.getCity() + "\nCustomer 2 city: " + c2.getCity());
		
	}

}
