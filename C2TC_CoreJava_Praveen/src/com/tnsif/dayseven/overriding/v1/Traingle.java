package com.tnsif.dayseven.overriding.v1;

public class Traingle extends Shape{
	private double base;
	private double height;
	
	//Constructor for Traingle
	public Traingle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	//Override draw method for Triangle
	@Override
	public void draw() {
		System.out.println("Drawing a triangle with base " + base + " and height " + height);
	}
	
	//Override erase method for Triangle
	@Override
	public void erase() {
		System.out.println("Erasing a triangle with base " + base + " and height " + height);
	}
}
