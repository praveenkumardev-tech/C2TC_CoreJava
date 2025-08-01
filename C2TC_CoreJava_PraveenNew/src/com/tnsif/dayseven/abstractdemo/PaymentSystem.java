package com.tnsif.dayseven.abstractdemo;

//abstract class
abstract class PaymentGateway{
	
	public abstract void paymentProcess(double amt);
		
	
	
	public void connectToPayment() {
		System.out.println("Connecting to the payment gateway");
	}
}

class creditPayment extends PaymentGateway{
	@Override
	public void paymentProcess(double amt) {
		System.out.println("Processing the amount ₹" + amt);
	}
}

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentGateway payment;
		
		payment = new creditPayment();
		payment.connectToPayment();
		payment.paymentProcess(20000.0);
	}

}
