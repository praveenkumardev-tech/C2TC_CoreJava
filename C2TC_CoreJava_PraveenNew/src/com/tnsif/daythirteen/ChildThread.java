package com.tnsif.daythirteen;

//Thread Class
public class ChildThread extends Thread{
	private int n;
	private String msg;
	
	//Constructor
	public ChildThread(int n, String name) {
		this.n = n;
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= n; i++) {
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				System.err.println("Thread interrupted: " + e.getMessage());
			}
			System.out.println(msg + i + " " + Thread.currentThread().getName());
		}
	}
	
	
}
