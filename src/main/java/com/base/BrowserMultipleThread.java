package com.base;

import com.testclass.LoginTest;

public class BrowserMultipleThread extends Thread {
	
	public String browserName;
	Base baseobj;
	LoginTest loginobj;
	public BrowserMultipleThread(String threadName,String browserName) {
		
		super(threadName);
	this.browserName=	browserName;
		baseobj=new Base();
		 loginobj=new LoginTest();
		
	}
    
	@Override
	public void run() {
		
		System.out.println("Current thread Started: "+Thread.currentThread().getName());
		
	 try {
		Thread.sleep(1000);
		baseobj.setup(this.browserName);
		
		loginobj.login();
		
		
		
		
	} catch (InterruptedException e) {


		e.printStackTrace();
	}
	 System.out.println("Current thread Ended: "+Thread.currentThread().getName());
	}
}
