package com.tnsif.dayeight.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements ChildInterface{
	//Override ChildInterface method
		public void print() {
			System.out.println("Print method");
		}
		
		//Override InterfaceOne method
		public void show() {
			System.out.println("Show method");
		}
}
