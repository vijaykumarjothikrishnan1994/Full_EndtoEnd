package com.libraries;

import java.awt.Desktop.Action;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;

//import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class LibrariesMethod extends Base {
	
	private static WebDriverWait wait;
	private static WebDriverWait waitGlobal=new WebDriverWait(Base.driver, 30);
	
	private static Actions act;
	private static JavascriptExecutor javascriptEnterText;
	public static void ClickByID(String ClickId) {
		
		
		//	Base.driver.findElement(By.xpath(ClickId)).click();
		
			
			Base.driver.findElement(By.id(ClickId)).click();
			
		
		
		
		
		
	}
	public static void ClickByXpath(String ClickXpath) {
		
		
		Base.driver.findElement(By.xpath(ClickXpath)).click();
	
		
		//Base.driver.findElement(By.id(ClickId)).click();
		
	
	
	
	
	
}
	
	
	public static void EnterText(String EnterXpath,String EnterValue) {
		
		Base.driver.findElement(By.id(EnterXpath)).sendKeys(EnterValue);
		
	}
	
	
	public static void DropDownValue(String xpathDD,String DDvalue)
	{
		
		Select sle=new Select(Base.driver.findElement(By.xpath(xpathDD)));
		
		sle.selectByVisibleText(DDvalue);
		
		
	}

	
	public static void EnterTextWait(String ETXpath,String ETValue )
	{  
		WebElement EnterTextWait_find= Base.driver.findElement(By.xpath(ETXpath));
		
		 try {
			wait=new WebDriverWait(Base.driver, 30);
			 WebElement eleEnterTextWait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ETXpath)));
			
			eleEnterTextWait.sendKeys(ETValue);
			
			System.out.println("Enter Text by ExplicitWait");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			wait.until(ExpectedConditions.visibilityOf(EnterTextWait_find));
	 javascriptEnterText=(JavascriptExecutor)Base.driver;
			javascriptEnterText.executeScript("arguments[0].setAttribute('value', '" + ETValue +"')",EnterTextWait_find );
			System.out.println("Enter Text by JavaScript");
			
			try {
				wait.until(ExpectedConditions.visibilityOf(EnterTextWait_find));
				 act=new Actions(Base.driver);
				act.sendKeys(EnterTextWait_find).build().perform();
				System.out.println("Enter Text by Actions");
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
				
				System.out.println("None of the Enter text is working");
			}
		}
		
		
		
	}
	
	public static void ClickWait(String ClkXpath,String ClkValue )
	{  
		WebElement ClickWait_find= Base.driver.findElement(By.xpath(ClkXpath));
		
		 try {
			wait=new WebDriverWait(Base.driver, 30);
			 WebElement eleEnterTextWait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ClkXpath)));
			
			eleEnterTextWait.click();
			
			System.out.println("Clicked by ExplicitWait");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			wait.until(ExpectedConditions.visibilityOf(ClickWait_find));
	 javascriptEnterText=(JavascriptExecutor)Base.driver;
			javascriptEnterText.executeScript("arguments[0].click();",ClickWait_find );
			System.out.println("Clicked by JavaScript");
			
			try {
				wait.until(ExpectedConditions.visibilityOf(ClickWait_find));
				 act=new Actions(Base.driver);
				act.click(ClickWait_find).build().perform();
				System.out.println("Clicked by Actions");
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
				
				System.out.println("None of the Click is working");
			}
		}
		
		
		
	}
	
	
	public static void waitDropDownUsingForEach(String XpathwaitDDFE) {
		
	WebElement elewDDUFE=	waitGlobal.until(ExpectedConditions.visibilityOf(Base.driver.findElement(By.xpath(XpathwaitDDFE))));
		
	
	}
	
}
