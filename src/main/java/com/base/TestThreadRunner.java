package com.base;

public class TestThreadRunner {
	
	
	public static void main(String args[]) {
		Thread t2=	new BrowserMultipleThread("firefox thread", "chrome");	
	Thread t1=	new BrowserMultipleThread("chrome thread", "chrome");
	
	
	System.out.println("Thread started");
	t1.start();
	t2.start();
		
	}

}
