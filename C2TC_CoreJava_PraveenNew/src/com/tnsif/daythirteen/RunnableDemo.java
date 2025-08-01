package com.tnsif.daythirteen;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using implementable class
		UsingRunnable obj = new UsingRunnable(10, 20, "Hello");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {//anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		//lambda expression
		runnable = () ->{
			System.out.println("Runnable with lambda expression");
		};
		new Thread(runnable).start();
		
		System.out.println("---------------------------------------------");
		int n = 5;
		runnable = () -> {
			try {
				for(int i = 1; i <= n; i++) {
					System.out.println("Loop iteration: " + i);
					Thread.sleep(1000);
				}
			}catch(InterruptedException e) {
				System.err.println("Task Interrupted.");
			}
		};
		
		//Execute the runnable
		new Thread(runnable).start();
	}

}
