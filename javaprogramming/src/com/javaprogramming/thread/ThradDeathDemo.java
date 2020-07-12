package com.javaprogramming.thread;

public class ThradDeathDemo {

	public static void main(String[] args) {
		Thread th1=new Thread("Thread-th1") {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				
				try {
					System.out.println(Thread.currentThread().getName()+" has started");
					
					stop();
					
				}catch(ThreadDeath ex) {
					
					System.out.println(Thread.currentThread().getName()+" has died");
				}
				
			}
			
			
		};

		
		th1.start();
	}

}
