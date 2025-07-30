package com.tnsif.dayeight.interfaceexample;

public class Executor {

	public static void main(String[] args) {
		Coder c1;
		
		//Trainer object
		c1 = new Student();
		c1.rules();
		
		//Student Object
		c1 = new Trainer();
		c1.rules();
		

	}

}
