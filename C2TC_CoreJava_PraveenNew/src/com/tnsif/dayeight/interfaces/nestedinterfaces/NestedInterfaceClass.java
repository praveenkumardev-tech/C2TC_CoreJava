package com.tnsif.dayeight.interfaces.nestedinterfaces;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface{
	@Override
	public void print() {
		System.out.println("This Print method of nested interface");
	}
}
