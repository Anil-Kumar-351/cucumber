package Stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample3 {
	@Given("user open signup page")
	public void user_open_signup_page() {
	    System.out.println("signup");
	}

	@When("user enters fastname as {string}")
	public void user_enters_fastname_as(String fn) {
	    System.out.println(" firstname "+fn);
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String ln) {
	    System.out.println(" lastname "+ln);
	}

	@When("user enters DOB as {string}")
	public void user_enters_DOB_as(String dob) {
	    System.out.println(" date of birth "+dob);

	}

	@When("user enters psd as {string}")
	public void user_enters_psd_as(String psd) {
	    System.out.println(" password "+psd);
	}

	@When("user enters confirmpsd as {string}")
	public void user_enters_confirmpsd_as(String cpsd) {
	    System.out.println(" confirm password "+cpsd);
	}

	@Then("click signup button")
	public void click_signup_button() {
	    System.out.println("click signup button");
	}

	@Then("verify signup success message")
	public void verify_signup_success_message() {
	    System.out.println("successfil signup");
	}



}
