package com.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {

	public static WebDriver driver;
	public static FileReader fileread;
	public static Properties pro;

	public Base() {
		// TODO Auto-generated constructor stub
		try {
			FileReader fileread = new FileReader(
					"E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\com.automation\\testData\\TestDataStore.properties");

			pro = new Properties();

			pro.load(fileread);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// prepareTest(browser);

	}

	// @Test
	public static void Init_Browser_old() {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\Git\\siteYourlogo-siteYourlogo\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pro.getProperty("URL"));

	}

	public static void Init_Browser() {
		Scanner sca = new Scanner(System.in);
		String Browsertype = sca.nextLine();

		if (Browsertype.contentEquals("chrome")) {

			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");

			System.setProperty("webdriver.chrome.driver",
					"E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\Git\\siteYourlogo-siteYourlogo\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(pro.getProperty("URL"));

		} else if (Browsertype.contentEquals("firefox")) {
			System.out.println("Launching the application with FireFox");
			System.setProperty("webdriver.gecko.driver",
					"E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\Git\\siteYourlogo-siteYourlogo\\Drivers\\FireFox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriver objefirefox = new FirefoxDriver();

			driver.manage().window().maximize();
			objefirefox.get(pro.getProperty("URL"));
		} else if (Browsertype == "ie") {
			System.out.println("Application currently not support for IE");
		} else {
			System.out.println("Please provide the supported browser");
		}

	}

	public static WebDriver setup(String BrowserName)
	{
		
	
		
		if(BrowserName.contentEquals("chrome"))
		{
			
			/*
			 * ChromeOptions option = new ChromeOptions();
			 * option.addArguments("--disable-notifications");
			 */

			System.setProperty("webdriver.chrome.driver",
					"E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\Git\\siteYourlogo-siteYourlogo\\Drivers\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			
		}
		else if(BrowserName.contentEquals("firefox"))
		{
			System.out.println("Launching the application with FireFox");
			System.setProperty("webdriver.gecko.driver","E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\Git\\siteYourlogo-siteYourlogo\\Drivers\\FireFox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			// objefirefox=new FirefoxDriver();
			 
			  driver=new FirefoxDriver();
			
			
			//  driver.manage().window().maximize(); 
			  //objefirefox.get(pro.getProperty("URL"));
			 
		}
		else if(BrowserName=="ie")
		{
			System.out.println("Application currently not support for IE");
		}
		else
		{
			System.out.println("Please provide the supported browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pro.getProperty("URL"));
		
		return driver;
	}
	
}
