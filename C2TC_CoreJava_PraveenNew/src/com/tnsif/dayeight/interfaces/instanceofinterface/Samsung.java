package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Samsung implements Phone{
	@Override
	public void call() {
		System.out.println("Calling using Smartphone");
	}
	
	@Override
	public void sms() {
		System.out.println("Messaging using Smartphone");
	}
}
