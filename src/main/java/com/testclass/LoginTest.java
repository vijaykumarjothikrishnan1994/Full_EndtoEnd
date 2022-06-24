package com.testclass;

import org.testng.annotations.Test;


import com.Utilities.Util;
import com.base.Base;
import com.libraries.LibrariesMethod;
import com.verification.VerifyAndValidate;

public class LoginTest extends Base{
	
	public LoginTest() {
		// TODO Auto-generated constructor stub
		Init_Browser_old();
	}
	@Test
	public static void login() {
		
		LibrariesMethod lib=new LibrariesMethod();
		
		//Utilobj.ImplicitWait_Syn(30);
		
		Util Utilobj=new Util();
		
		Utilobj.ImplicitWait_Syn(30);
		
		System.out.println(Utilobj.proutil.getProperty("clickSignbtn"));
		lib.ClickByXpath(Utilobj.proutil.getProperty("clickSignbtn"));
		lib.EnterText(Utilobj.proutil.getProperty("entersigninusername"),"vtest@gmail.com");
		lib.EnterText(Utilobj.proutil.getProperty("entersigninpassword"),"vtest@123");
		lib.ClickByID(Utilobj.proutil.getProperty("Clickloginbtn"));
		
		VerifyAndValidate objverify=new VerifyAndValidate();
		
		String stringHometitle= Base.driver.getTitle();
		System.out.println("This is captured title: "+stringHometitle);
		objverify.assertvalue.assertEquals(stringHometitle, "My account - My Store","Value is not expected");
		
		
	}

}
