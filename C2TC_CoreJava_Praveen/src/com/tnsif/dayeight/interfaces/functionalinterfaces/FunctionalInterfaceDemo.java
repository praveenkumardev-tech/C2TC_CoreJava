package com.tnsif.dayeight.interfaces.functionalinterfaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetClass g = new GreetClass();
		System.out.println(g.greet());
		
		//using Lamba Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};
		
		System.out.println(g1.greet());

	}

}
