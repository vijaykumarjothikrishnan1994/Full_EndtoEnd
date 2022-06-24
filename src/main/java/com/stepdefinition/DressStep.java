package com.stepdefinition;

import com.testclass.Dresstest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DressStep extends Dresstest{
	@Given("^launch the Dress page and validate the all elements$")
	public void launch_the_Dress_page_and_validate_the_all_elements() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LaunchDressTab();
		
	}

	@When("^Click the sortby dropdown in Dress page and select lowest_first$")
	public void click_the_sortby_dropdown_in_Dress_page_and_select_lowest_first() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.err.println("When");
	}

	@Then("^verify the lowest value should be selected in Dress page$")
	public void verify_the_lowest_value_should_be_selected_in_Dress_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.err.println("Then");
	}
	@Given("^Evening dress page should be validated succesfully$")
	public void evening_dress_page_should_be_validated_succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LaunchingEveningTab();
	}

	@When("^Click the Evening page$")
	public void click_the_Evening_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.err.println("Then");
	}

	@Then("^Verify the title of the page$")
	public void verify_the_title_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.err.println("Then");
	}

}
