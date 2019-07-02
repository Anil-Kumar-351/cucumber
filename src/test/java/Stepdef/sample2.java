package Stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class sample2 {
	@Given("open newtours applcation")
	public void open_newtours_applcation() {
		System.out.println("open newtours applcation");
	   
	}

	@When("user enters un {string} and psd as {string}")
	public void user_enters_un_and_psd_as(String un, String psd) {
		System.out.println("username: "+un+"password: "+psd);
	    
	}

	@When("submit login form")
	public void submit_login_form() {
		System.out.println("login");
	}

	@Then("verifypass")
	public void verifypass() {
		System.out.println("pass test");
	    
	}

	@Then("verify failure")
	public void verify_failure() {
		System.out.println("fail test");
	}


}
