package com.tnsif.daysix.usingfinal;

final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

// ❌ This will cause error because FinalClass is final
// class FinalChildClass extends FinalClass { }

public class FinalClassDemo {
	public static void main(String[] args) {
		FinalClass f1 = new FinalClass();
		f1.show();
	}
}
