package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.testclass.LoginTest;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class loginStep extends LoginTest{

	
	
	@Given("^: launch the application$")
	public void launch_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		login();
		
		
	}

	@When("^: capture the title$")
	public void capture_the_title() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("This is When");
	}

	@Then("^: Verify the title$")
	public void verify_the_title() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("This is Then");
	}


}
