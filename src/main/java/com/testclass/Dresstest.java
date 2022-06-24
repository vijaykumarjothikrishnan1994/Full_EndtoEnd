package com.testclass;

import org.testng.annotations.Test;

import com.Utilities.Util;
import com.base.Base;
import com.libraries.LibrariesMethod;
import com.verification.VerifyAndValidate;

public class Dresstest extends LoginTest{
	public static LibrariesMethod lib;
	public Dresstest() {
		// TODO Auto-generated constructor stub
		
		login();
		
	}
	
	//@Test
	public static void LaunchDressTab() {
		
		Util.ImplicitWait_Syn(30);
		lib=new LibrariesMethod();
		lib.ClickByXpath(Util.proutil.getProperty("ClickDressTab"));
		
		String title_tshirt=Base.driver.getTitle();
		System.out.println("This is the page title : "+title_tshirt);
		VerifyAndValidate val=new VerifyAndValidate();
		val.assertvalue.assertEquals(title_tshirt, "Dresses - My Store","Expected value is not found");
		lib.DropDownValue(Util.proutil.getProperty("SelectSortbyDDDress"), "Price: Highest first");
		
	}
	
	public static void LaunchingEveningTab() {
		LaunchDressTab();
		lib.ClickWait(Util.proutil.getProperty("SelectEveningDressTab"), null);
		
		
	}

}
