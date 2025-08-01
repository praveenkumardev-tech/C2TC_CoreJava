package com.tnsif.daythirteen;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChildThread threadOne = new ChildThread(5, "First");
		ChildThread threadTwo = new ChildThread(10, "Second");
		
		
		threadOne.start();
		//threadOne.start(); // throws IlleagleStateException
		//threadOne.run(); // single threaded application
		threadTwo.start();
		
		threadOne.sleep(3000);
		threadOne.join();
		threadTwo.join();
		
		
		System.out.println("---------------------End of Main----------------------------");
	}

}
