package com.tnsif.daysix.usingfinal;

public class FinalVariable {

	final int x = 100;

	final static int Y;

	final static int Z = 10;

	// instance method
	void change() {
		// x = 30; // ❌ Cannot reassign final variable
		// Y = 200; // ❌ Cannot reassign final static variable
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y=" + Y + "]";
	}

	static {
		Y = 20; // ✅ Initialized only once
		// Z = 100; // ❌ Already initialized as 10
		System.out.println("Value of Y: " + Y);
	}
}
