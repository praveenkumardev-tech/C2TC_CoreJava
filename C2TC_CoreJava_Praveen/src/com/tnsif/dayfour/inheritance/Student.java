package com.tnsif.dayfour.inheritance;

public class Student extends Person{
	private int sid;
	private String department;
	
	void show() {
		System.out.println("In Student Class");
	}
	
	void display() {
		System.out.println("In Student Class - display method");
	}
}
