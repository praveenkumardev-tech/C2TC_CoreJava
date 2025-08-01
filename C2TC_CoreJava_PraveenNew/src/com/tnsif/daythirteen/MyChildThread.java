package com.tnsif.daythirteen;

public class MyChildThread extends Thread{
	
	public void run() {
		System.out.println("In side run() Thread is alive or not? " + this.isAlive());
		int no = 0;
		while(no < 4) {
			no++;
			System.out.println("Number = " + no);
			try {
				sleep(500);
			}catch(InterruptedException exp) {
				System.err.println("Thread Interrupted...");
			}
		}
	}
}
