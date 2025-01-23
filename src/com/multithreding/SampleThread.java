package com.multithreding;

public class SampleThread extends Thread {
	public void run() {
		try {
		System.out.println("Thread is running");
		 System.out.println(Thread.currentThread().getName());
		 Thread.sleep(2000);
		 System.err.println(Thread.currentThread().getName()+ " has finised sleeping");
		
		}catch(InterruptedException ie) {
			System.out.println("Thread Interrupted...");
		}
	}

}
