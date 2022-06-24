package com.stepdefinition;

import com.testclass.TshirtTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TshirtStep extends TshirtTest{
	@Given("^launch the tshirt page and validate the all elements$")
	public void launch_the_tshirt_page_and_validate_the_all_elements() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		
		Tshirtpage();	
	}

	@When("^Click the sortby and select lowest_first$")
	public void click_the_sortby_and_select_lowest_first() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.out.println("When");
	}

	@Then("^verify the lowest value should be selected$")
	public void verify_the_lowest_value_should_be_selected() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		System.out.println("Then");
	}



}
