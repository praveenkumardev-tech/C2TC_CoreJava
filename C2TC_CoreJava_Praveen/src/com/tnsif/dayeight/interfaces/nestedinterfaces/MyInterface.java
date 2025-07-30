package com.tnsif.dayeight.interfaces.nestedinterfaces;

public interface MyInterface {
	void calculateAre();
	interface MyInnerInterface{
		int id = 20;
		void print();
	}
}
