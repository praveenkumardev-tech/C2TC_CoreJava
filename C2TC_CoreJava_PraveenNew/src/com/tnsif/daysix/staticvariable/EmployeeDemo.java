package com.tnsif.daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create the first object of the class and pass the two arguments with type string and int.
		System.out.println(Employee.companyName);
		Employee e = new Employee("Praveen", 123);
		System.out.println(e);
		
		//Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Prem", 456);
		System.out.println(e);
	}

}
