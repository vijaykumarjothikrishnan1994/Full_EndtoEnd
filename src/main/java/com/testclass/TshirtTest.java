package com.testclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Utilities.Util;
import com.base.Base;
import com.libraries.LibrariesMethod;
import com.verification.VerifyAndValidate;

public class TshirtTest extends LoginTest{
	public TshirtTest() {
		// TODO Auto-generated constructor stub
		
		login();
	}
	
	@Test
	public static void Tshirtpage()
	{   Util.ImplicitWait_Syn(30);
		LibrariesMethod lib=new LibrariesMethod();
		lib.ClickByXpath(Util.proutil.getProperty("ClickTshirtTab"));
		
		String title_tshirt=Base.driver.getTitle();
		System.out.println("This is the page title : "+title_tshirt);
		VerifyAndValidate val=new VerifyAndValidate();
		val.assertvalue.assertEquals(title_tshirt, "T-shirts - My Store","Expected value is not found");
		lib.DropDownValue(Util.proutil.getProperty("SelectSortbyDD"), "Reference: Lowest first");
		
	}
	
	
	public static void CloseBrowser()
	{
		
		Util.GlobalWait(3000);
		Base.driver.close();
		
	}

}
