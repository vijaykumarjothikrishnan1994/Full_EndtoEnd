package com.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.base.Base;

public class Util {
	
	public static FileReader Readfile;
	public static Properties proutil;
	
	public Util() {
		// TODO Auto-generated constructor stub
		
		
		try {
			Readfile=new FileReader("E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\com.automation\\testData\\TestDataXpath.properties");
			
			 proutil=new Properties();
			
			proutil.load(Readfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static int GlobalWait(int waitvalueset)
	{
		//int waitValue;
		try {
			Thread.sleep(waitvalueset);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return waitvalueset;
	}
	
	
	public static int ImplicitWait_Syn(int ValueImplicitWait) {
		
		Base.driver.manage().timeouts().implicitlyWait(ValueImplicitWait, TimeUnit.SECONDS);
		return ValueImplicitWait;
	}
}
